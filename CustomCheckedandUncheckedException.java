class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

class CustomCheckedandUncheckedException {
    public void processData(String data) throws CustomCheckedException, CustomUncheckedException {
        if (data.equals("error")) {
            throw new CustomCheckedException("Custom checked exception occurred.");
        } else if (data.equals("fatal")) {
            throw new CustomUncheckedException("Custom unchecked exception occurred.");
        } else {
            System.out.println("Data processed successfully: " + data);
        }
    }

    public static void main(String[] args) {
        CustomCheckedandUncheckedException dataProcessor = new CustomCheckedandUncheckedException();

        try {
            dataProcessor.processData("valid");
            dataProcessor.processData("error");
            dataProcessor.processData("fatal");
        } catch (CustomCheckedException e) {
            System.err.println("Caught checked exception: " + e.getMessage());
        } catch (CustomUncheckedException e) {
            System.err.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}

