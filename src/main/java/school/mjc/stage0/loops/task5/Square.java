package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for(int i = 1; i<=sideLength; i++){
            String  side = "";
            for(int a = 1; a<=sideLength;a++){
                if(i==1 || i==sideLength){
                    side += 8;
                }else {
                    if(a==1 || a ==sideLength) {
                        side += "8";
                    }else{side += " ";}
                }
            }
            System.out.println(side);
        }
    }
}
