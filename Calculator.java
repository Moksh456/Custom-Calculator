class InvalidIndputException extends Exception{
        public String toString(){
            return "can't add 8 and 9";
        }
        public String getMessage(){
            return "i am a get message";
        }
                    
}
class cannotDevideByzeroException extends Exception{
    public String toString(){
        return "can't divide by zero";
    }
}
 
class custormcal{
    double add(double a, double b) throws InvalidIndputException{
        if (a== 8 || b == 9){
    throw new InvalidIndputException();
        }
return a+b;
    }
    double sustract(double a, double b){
        return a-b;
            }
            double divide(double a, double b)throws cannotDevideByzeroException{
                if (b==0) {
                    throw new cannotDevideByzeroException();
                }
                return a/b;
                    }
                    double multiply(double a, double b){
                        return a*b;
                            }
                    
}
public class Calculator{
    public static void main(String[] args) throws InvalidIndputException, cannotDevideByzeroException {
        //this is quetions throws expections 
        custormcal c = new custormcal();
     //   c.add(8, 9);
        c.divide(12, 0);

        
    }
}