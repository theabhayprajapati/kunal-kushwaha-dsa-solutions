package arrays;

/**
 * FlipImage
 */
public class FlipImage {

    // make array of image
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 1, 0 },
        };

        // flip image horizontally
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;
                // image[i][j] = image[i][j] == 0 ? 1 : 0;
                // if value is 0, change to 1
                // if value is 1, change to 0
            }
            // inver
            for (int j = 0; j < image.length; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
                
            }
        }
        // horz. line
        System.out.println("....");

        // print arr
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

}