import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Box box[] = new Box[3*n];
        int optHeight[] = new int[3*n];
        for(int i = 0;i < n;i++){
            // get the dimensions of the box
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            box[3*i] = new Box(x, y, z);
            box[3*i + 1] = new Box(y, z, x);
            box[3*i + 2] = new Box(x, z, y);
        }
        Arrays.sort(box); // sort the boxes in ascending order of their base areas.
        optHeight[0] = box[0].height;
        int ans = 0;
        for(int i = 1; i < 3*n; i++)
        {
            int maxHeight = 0;
            for(int j = i-1; j >= 0; j--)
            {
                // if the earlier box has smaller base & the height till that box is the greatest then we'll consider that stack
                if(box[j].length < box[i].length && box[j].breadth < box[i].breadth && optHeight[j] > maxHeight)
                    maxHeight = optHeight[j];
            }
            optHeight[i] = maxHeight + box[i].height;
            ans = Math.max(ans, optHeight[i]);
        }
        System.out.println(ans);
    }
}
