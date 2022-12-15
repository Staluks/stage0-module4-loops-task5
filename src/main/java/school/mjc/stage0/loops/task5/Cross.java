package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for(int i = 1; i<=sideLength; i++){
            String side = "";
            for(int a=1; a<= sideLength; a++){
                if(i!=(sideLength+1)/2){
                    if(a!=(sideLength+1)/2){
                        side += " ";
                    }else{
                        side += 8;
                    }
                }else{
                    side += 8;
                }
            }
            System.out.println(side);
        }
    }
}
