import java.util.Arrays;
public class BoxStacking {

    public int maxHeight(Dimension[] input) {

        Dimension[] allRotationInput = new Dimension[input.length * 3];
        createAllRotation(input, allRotationInput);

        Arrays.sort(allRotationInput);

        int T[] = new int[allRotationInput.length];
        int result[] = new int[allRotationInput.length];

        for (int i = 0; i < T.length; i++) {
            T[i] = allRotationInput[i].height;
            result[i] = i;
        }

        for (int i = 1; i < T.length; i++) {
            for (int j = 0; j < i; j++) {
                if (allRotationInput[i].length < allRotationInput[j].length
                        && allRotationInput[i].width < allRotationInput[j].width) {
                    if( T[j] + allRotationInput[i].height > T[i]){
                        T[i] = T[j] + allRotationInput[i].height;
                        result[i] = j;
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i < T.length; i++){
            if(T[i] > max){
                max = T[i];
            }
        }

        return max;
    }

    private void createAllRotation(Dimension[] input,
                                   Dimension[] allRotationInput) {
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            allRotationInput[index++] = Dimension.createDimension(
                    input[i].height, input[i].length, input[i].width);
            allRotationInput[index++] = Dimension.createDimension(
                    input[i].length, input[i].height, input[i].width);
            allRotationInput[index++] = Dimension.createDimension(
                    input[i].width, input[i].length, input[i].height);

        }
    }
}