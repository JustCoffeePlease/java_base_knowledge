
package L27_exceptions;

public class OwnException {
    void marathon(int temperature, int pace) throws BrokenLegException{
        if(pace > 12){
            throw new BrokenLegException("Pace was too high " + pace);
        }
        if(temperature > 35){
            throw new CrampedLegException();
        }
        System.out.println("Congratulations!");
    }
    
    public static void main(String[] args){
        OwnException t = new OwnException();
        try{
            t.marathon(60, 10);
        }
        catch(BrokenLegException e){
            System.out.println(e.getMessage());
        }
//        catch(CrampedLegException e){}
        finally{
            System.out.println("You do it!");
        }
    }
}

class BrokenLegException extends Exception{
    BrokenLegException(String message){
        super(message);
    }
    BrokenLegException(){};
}

class CrampedLegException extends RuntimeException{
    CrampedLegException(String message){
        super(message);
    }
    CrampedLegException(){};
}
