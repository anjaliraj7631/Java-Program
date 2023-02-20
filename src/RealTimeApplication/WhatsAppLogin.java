package RealTimeApplication;


import java.util.Scanner;
//inheritance example
class WhatsAppLogin {
    public void login() {
        System.out.println("you logged in to whatsApp");
    }
    public void logout() {
        System.out.println("Logged out from WhatsApp");
    }
}
class Chat extends WhatsAppLogin {
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
    public void receiveMessage(String message){
        System.out.println("Receiving message: " + message);
    }
}
class PrivateChat extends Chat {
    public void startPrivateChat(String contact) {
        System.out.println("Starting private chat with " + contact);
    }
}
class GroupChat extends Chat {
    public void createGroupChat(String groupName) {
        System.out.println("Creating a group chat with: " + groupName);
    }
}
class Call extends WhatsAppLogin {
    public void makeCall(String contact) {
        System.out.println("Making a call with "+ contact);
    }
    public void receiveCall(String contact) {
        System.out.println("Call is recieved by "+ contact);
    }
}
class AudioCall extends Call {
    public void makeAudioCall(String contact) {
        System.out.println("Making an audio call with "+ contact);
    }

}
class VideoCall extends Call {
    public void makeVideoCall(String contcat) {
        System.out.println("Making a video call with "+ contcat);
    }
}
class Payment extends WhatsAppLogin {
    public void sendPayment(float amount, String name) {
        System.out.println("Sending payment of: $" + amount+" to "+ name);
        System.out.println("Thank you for payment!");
    }
}
class WhatsAppApplication {
    public static void main(String[] args) {
        PrivateChat privateChat = new PrivateChat();
        GroupChat groupChat = new GroupChat();
        AudioCall audioCall = new AudioCall();
        VideoCall videoCall = new VideoCall();
        Payment payment = new Payment();
        Scanner sc = new Scanner(System.in);
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
                phone=true;
                System.out.println("Valid phone number");
                int genOtp = (int) (Math.random() * 999) + 100;
                System.out.println("Generated otp: " + genOtp);
                boolean otpValid=false;
                while (!otpValid) {
                    System.out.println("Enter otp:");
                    int otp = sc.nextInt();
                    if (genOtp == otp) {
                        otpValid = true;
                        privateChat.login();
//                System.out.println("1.Private Chat \n2.Group Chat \n3.Audio Call \n4.Video Call \n5.Payment");
                        boolean exit = false;
                        while (!exit) {
                            System.out.println("-------------------");
                            System.out.println("1.Chat  \n2.Call \n3.Payment \n4.Exit");
                            System.out.println("Enter Choice");
                            int choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1.Private Chat \n2.Group Chat");
                                    System.out.println("Enter Choice");
                                    int chat = sc.nextInt();
                                    switch (chat) {
                                        case 1:
                                            System.out.println("Enter person name: ");
                                            String contact= sc.next();
                                            privateChat.startPrivateChat(contact);
                                            System.out.println("Enter message u want to send: ");
                                            String send=sc.next();
//                                                    privateChat.sendMessage("Hello, Mom how are you!");
                                            privateChat.sendMessage(send);
                                            privateChat.receiveMessage("I am good, what about you " + username + " and how your study is going on");
                                            break;
                                        case 2:
                                            System.out.println("Enter group name: ");
                                            String contact1= sc.next();
                                            groupChat.createGroupChat(contact1);
                                            System.out.println("Enter message u want to send: ");
                                            String send1=sc.next();
                                            groupChat.sendMessage(send1);
                                            groupChat.receiveMessage("hello " + username);
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("1.Audio Call \n2.Video Call");
                                    System.out.println("Enter Choice");
                                    int call = sc.nextInt();
                                    switch (call) {
                                        case 1:
                                            audioCall.makeAudioCall("Bhai");
                                            audioCall.receiveCall("Bhai");
                                            break;
                                        case 2:
                                            videoCall.makeVideoCall("papa");
                                            videoCall.receiveCall("papa");
                                            break;
                                        case 3:
                                            System.out.println("Exiting from call");
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                            break;
                                    }
                                    break;
                                case 3:
                                    payment.sendPayment(2500.0f, "bhai");
                                    break;
                                case 4:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                        }
                        privateChat.logout();
                    } else {
                        otpValid=false;
                        System.out.println("Invalid otp");
                        System.out.println("Please re-enter otp correctly");
                    }
                }
            } else {
                phone=false;
                System.out.println("Invalid phone number! please re-enter");
            }
        }
    }
}


