package RealTimeApplication;


import java.util.Scanner;

class MobileDevice {
    String brand;
    String model;
    MobileDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void displayDeviceInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Camera extends MobileDevice {
    int megapixels;

    public Camera(String brand, String model, int megapixels) {
        super(brand, model);
        this.megapixels = megapixels;
    }
    public void takePhoto() {
        System.out.println("Taking a photo with " + megapixels + " megapixels with "+brand);
    }
}

class Gallery extends Camera {
    public Gallery(String brand, String model, int megapixels) {
        super(brand, model, megapixels);
    }
    public void viewPhotos() {
        System.out.println("Viewing photos in the gallery in "+ brand + model);
    }
}

class MainDevice {
    public static void main(String[] args) {
        Gallery smartphone = new Gallery("Samsung", "Galaxy S21", 64);
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while (!exit) {
            System.out.println("1.Device Information \n2.Camera \n3.Gallery \n4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:System.out.println("Device Information:");
                    smartphone.displayDeviceInfo();
                    break;
                case 2: System.out.println("\nCamera :");
                    smartphone.takePhoto();
                    break;
                case 3:   System.out.println("\nGallery:");
                    smartphone.viewPhotos();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


