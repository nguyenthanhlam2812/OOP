public class SpiralWalk {
    public static void main(String[] args) {
        int x = 0, y = 0; 
        int stepSize = 1; 
        int stepsTaken = 0;
        int direction = 0; 

        int totalSteps = 100; 

        for (int i = 0; i < totalSteps; i++) {
            switch (direction) {
                case 0: x++; break; 
                case 1: y--; break; 
                case 2: x--; break; 
                case 3: y++; break; 
            }

            System.out.println("(" + x + ", " + y + ")");

            stepsTaken++;

            if (stepsTaken == stepSize) {
                stepsTaken = 0;
                direction = (direction + 1) % 4; 

                if (direction == 0 || direction == 2) {
                    stepSize++;
                }
            }
        }
    }
}
