package RealTimeApplication;

import java.util.Scanner;

class InstagramApplication {
    String username;
    public void login() {
        System.out.println("you logged in to instagram");
    }
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
    public void receiveMessage(String message){
        System.out.println("Receiving message: " + message);
    }
    public void postPhoto(String caption) {
        System.out.println("Posted a photo: " + caption);
    }
    public void postStory(String image) {
        System.out.println("Posted a story: " + image);
    }
    public void postVideo(String video) {
        System.out.println("Posted a video: " + video);
    }
    public void instaLive(){
        System.out.println("Starting Insta Live stream...");
    }
    public void likePhoto() {
        System.out.println("Liked a photo");
    }
    public void save() {
        System.out.println("Saved into collection");
    }
    public void logout() {
        System.out.println("Logged out from instagram");
    }
}
class BroadcastChannel extends InstagramApplication {
    String channelName;
    public BroadcastChannel(String channelName) {
        this.channelName = channelName;
    }
    void startLiveBroadcast() {
        System.out.println("Starting a live broadcast...");
    }
//    public void postPhotoChannel(String caption) {
//        System.out.println("Posted a photo on " + channelName + ": " + caption);
//    }
}
class InstagramLogin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//    System.out.println("enter channel name");
//    String cha=sc.next();
       InstagramApplication instaApp=new InstagramApplication();
//    BroadcastChannel channel=new BroadcastChannel(cha);
        System.out.println("Enter username: ");
        String username = sc.next();
        boolean phone = false;
        while (!phone) {
            System.out.println("Enter 10 Digit Phone Number: ");
            long phoneNumber = sc.nextLong();
            long c = 0;
            while (phoneNumber > 0) {
                c++;
                phoneNumber = phoneNumber / 10;
            }
            if (c == 10) {
                phone = true;
                System.out.println("Valid phone number");
                int genOtp = (int) (Math.random() * 999) + 100;
                System.out.println("Generated otp: " + genOtp);
                boolean otpValid = false;
                while (!otpValid) {
                    System.out.println("Enter otp:");
                    int otp = sc.nextInt();
                    if (genOtp == otp) {
                        otpValid = true;
                        instaApp.login();
                    }
                    System.out.println("enter channel name");
                    String cha=sc.next();
                    BroadcastChannel channel=new BroadcastChannel(cha);
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("-------------------");
                        System.out.println("1.Chat  \n2.Post \n3.Like  \n4.Save File \n5.Channel \n6.Exit");
                        System.out.println("Enter Choice");
                        int choice = sc.nextInt();
                        switch (choice){
                            case 1:System.out.println("Enter name to start chat : ");
                                String contact= sc.next();
                                System.out.println("Enter message: ");
                                String msg= sc.next();
                                channel.sendMessage(msg);
                                channel.receiveMessage("Hello...");
                                break;
                            case 2:
                                boolean exit1 = false;
                                while (!exit1) {
                                    System.out.println("1.Photo  \n2.Video \n3.Story  \n4.Exit");
                                    int choice1 = sc.nextInt();
                                    switch (choice1) {
                                        case 1:
                                            System.out.println("Enter Caption for photo : ");
                                            String cap = sc.next();
                                            channel.postPhoto(cap);
                                            break;
                                        case 2:
                                            System.out.println("Enter Caption for video : ");
                                            String cap1 = sc.next();
                                            channel.postVideo(cap1);
                                            break;
                                        case 3:
                                            System.out.println("Enter Caption for story : ");
                                            String cap3 = sc.next();
                                            channel.postStory(cap3);
                                            break;
                                        case 4:
                                            exit1 = true;
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                            break;
                                    }
                                }
                                break;
                            case 3:channel.likePhoto();
                                break;
                            case 4:channel.save();
                                break;
                            case 5:
                                boolean exit2 = false;
                                while (!exit2) {
                                    System.out.println("1.Start Live Broadcast chat \n2.Send Photo \n3.Send Video \n4.Like \n5.Exit");
                                    int choice3 = sc.nextInt();
                                    switch(choice3){
                                        case 1:
                                            channel.startLiveBroadcast();
                                            break;
                                        case 2:
                                            System.out.println("Enter photo name: ");
                                            String cap = sc.next();
                                            channel.postPhoto(cap);
                                            break;
                                        case 3:
                                            System.out.println("Enter video name: ");
                                            String cap1 = sc.next();
                                            channel.postVideo(cap1);
                                            break;
                                        case 4:
                                            channel.likePhoto();
                                            break;
                                        case 5:
                                            exit2=true;
                                            break;
                                        default:
                                            System.out.println("Invalid Choices");
                                            break;
                                    }
                                }
                                break;
                            case 6:
                                exit = true;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }
                }
            }
        }
    }
}
