
package Homework.Homework6;

class SumNum {
    
    int sum(int a11, int a21, int a31, int a41){
        
        a1 = a11;
        a2 = a21;
        a3 = a31;
        a4 = a41;
        
        int s = a1 + a2 + a3 + a4;
                
        System.out.println(s);
        return s;
    }
    
    int sum(int a12, int a22, int a32){
        a1 = a12;
        a2 = a22;
        a3 = a32;
        a4 = 0;
        
        int s = a1 + a2 + a3 + a4;
        
        System.out.println(s);
        return s;
    }
    
    int sum(int a13, int a23){
        a1 = a13;
        a2 = a23;
        a3 = 0;
        a4 = 0;
        
        int s = a1 + a2 + a3 + a4;
        
        System.out.println(s);
        return s;
    }
        
    int sum(int a14){
        a1 = a14;
        a2 = 0;
        a3 = 0;
        a4 = 0;
        
        int s = a1 + a2 + a3 + a4;
        
        System.out.println(s);
        return s;
    }
        
    int sum(){        
        System.out.println(0);
        return 0;
    }
    
    int a1, a2, a3, a4;
}

class SumNumTest{
    public static void main(String[] args){
        SumNum com_1 = new SumNum();
            com_1.sum();
            com_1.sum(1, 2);
            com_1.sum(1, 2, 3);
            com_1.sum(1, 2, 3, 4);
            
    }

}
