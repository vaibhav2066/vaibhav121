import java.util.Scanner;

class CustomerChatbot {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Customer Support Chatbot!");

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Start the conversation
        System.out.print("Customer: ");
        String userInput = scanner.nextLine();

        // Continue the conversation until the user says "bye"
        while (!userInput.equalsIgnoreCase("bye")) {
            String response = generateResponse(userInput);
            System.out.println("Chatbot: " + response);

            // Get the next user input
            System.out.print("Customer: ");
            userInput = scanner.nextLine();
        }

        // Farewell message
        System.out.println("Chatbot: Thank you for using our customer support. Goodbye!");

        // Close the scanner
        scanner.close();
    }

    public static String generateResponse(String userInput) {
        // Define the chatbot's responses based on user input
        String response;
        if (userInput.contains("order")) {
            response = "For order-related inquiries, please contact our sales team at sales@example.com.";
        } else if (userInput.contains("payment")) {
            response = "Our accepted payment methods include credit cards, PayPal, and bank transfers.";
        } else if (userInput.contains("delivery")) {
            response = "Delivery times vary based on your location and the shipping method selected. You can check the estimated delivery time during the checkout process.";
        } else if (userInput.contains("return")) {
            response = "To initiate a return, please fill out the return request form on our website or contact our customer support team.";
        } else if (userInput.contains("technical")) {
            response = "For technical assistance, please send an email to support@example.com with detailed information about the issue you are facing.";
        } else {
            response = "I'm sorry, but I couldn't understand your request. Please provide more specific information or contact our customer support team for further assistance.";
        }

        return response;
    }
}
