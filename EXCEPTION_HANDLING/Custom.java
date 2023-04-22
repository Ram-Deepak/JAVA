class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class Custom{
    public static void validate(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args){
        try{
            validate(17);
            System.out.println("Rest of the code");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End of exception handling");
        }
    }
}