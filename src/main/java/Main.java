import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/*

Types used in this code:

(Add your answers to lab instruction #4 here)

 */

void main() {

    try {
        var avatarStream = getRandomAvatarStream();
        showAvatar(avatarStream);
    } catch (IOException | InterruptedException e) {
        JOptionPane.showMessageDialog (null, "Failed to load avatar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // JOptionPane.showMessageDialog = Class method | e.getMessage = Instance method | JOptionPane.ERROR_MESSAGE = Class variable
    }

}

InputStream getRandomAvatarStream() throws IOException, InterruptedException {
    // Pick a random style
    String[] styles = { "adventurer", "adventurer-neutral", "avataaars", "big-ears", "big-ears-neutral", "big-smile", "bottts", "croodles", "croodles-neutral", "fun-emoji", "icons", "identicon", "initials", "lorelei", "micah", "miniavs", "open-peeps", "personas", "pixel-art", "pixel-art-neutral" };
    var style = styles[(int)(Math.random() * styles.length)]; // 1. Math.random = Class method | styles.length = instance variable

    // Generate a random seed
    var seed = (int)(Math.random() * 10000); // 1. Math.random = Class method

    // Create an HTTP request for a random avatar
    var uri = URI.create("https://api.dicebear.com/9.x/%s/png?seed=%d".formatted(style, seed)); // 1. URI.create = class method | "https://api.dicebear.com/9.x/%s/png?seed=%d".formatted = instance variable
    var request = HttpRequest.newBuilder(uri).build(); // 1. HttpRequest.newBuilder = class method | newBuilder(uri).build() = instance method


    // Send the request
    try (var client = HttpClient.newHttpClient()) { // 1. HttpClient.newHttpClient = Class method
        var response = client.send(request, HttpResponse.BodyHandlers.ofInputStream()); // 1. .send = instance method | .BodyHandlers = class variable | .ofInputStream = class instance
        return response.body(); // 1. .body = instance method
    }
}

void showAvatar(InputStream imageStream) {
    JFrame frame = new JFrame("PNG Viewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(200, 200);
    frame.getContentPane().setBackground(Color.BLACK);

    try {
        // Load the PNG image
        Image image = ImageIO.read(imageStream);

        // Create a JLabel to display the image
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        frame.add(imageLabel, BorderLayout.CENTER);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(frame, "Failed to load image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    frame.setVisible(true);
}
