class Dog {
    String name;
    String breed;
    double age;

   static class DogYears {
    Integer age;
    DogYears(Integer age){
    this.age = age;
        }
    }

    Dog(String name, String breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    Dog(String name, String breed,DogYears dogYears) {
        this.name = name;
        this.breed = breed;
        this.age = (double) dogYears.age / 7;
    }

    private double getDogYears() {
        return this.age * 7;
    }


    static void main() {
       Dog dog1 = new Dog("Buddy", "Golden Retreiver", 5);
       Dog dog2 = new Dog("Doodle", "French Poodle", 6);
       IO.println(dog2.name + " is "+ dog2.getDogYears() + "  years old.");

   }
}