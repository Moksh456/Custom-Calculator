//throwing a invalid input   excetions
class InvalidIndputException extends Exception{
        public String toString(){
            return "can't add 8 and 9";
        }
        public String getMessage(){
            return "i am a get message";
        }
                    
}
// throws a cant devide by zero exceptions in the following code"
class cannotDevideByzeroException extends Exception{
    @Override
    public String toString(){
        return "can't divide by zero";
    }
}
// throws a max input exceptions 
class maxInputException extends Exception{
    @Override
    public String toString(){
        return "please enter a value greater then 100000 ";
    }
}

// this is our main and returning class 
class custormcal{
    // following code for adding the value
    double add(double a, double b) throws InvalidIndputException, maxInputException {
        if (a>100000 || b>100000){
            throw new maxInputException();  
            
        }
        if (a== 8 || b == 9){
    throw new InvalidIndputException();
        }
return a+b;
    }
    // following code for subtract
    double sustract(double a, double b)throws maxInputException{
        if (a>100000 || b>100000){
            throw new maxInputException();  
        }
        
        return a-b;
            }
        // following code for dividig
            double divide(double a, double b)throws cannotDevideByzeroException , maxInputException{
                if (a>100000 || b>100000){
                    throw new maxInputException();  
                    
                }
                if (b==0) {
                    throw new cannotDevideByzeroException();
                }
                return a/b;
                    }
                    // following code for multplying
                    double multiply(double a, double b)throws maxInputException{
                        if (a>100000 || b>100000){
                            throw new maxInputException();  
                            
                        }
                        return a*b;
                            }
                    
}
public class Calculator{
    public static void main(String[] args) throws InvalidIndputException, cannotDevideByzeroException , maxInputException{
        //this is quetions throws expections 
        custormcal c = new custormcal();
     //   c.add(8, 9);
        
// if u want to run and method then call and print.
        System.out.println(c.add(120, 130));
    }
}