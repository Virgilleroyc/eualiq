import java.util.Random;

public class ReservoirSampling {
    public int[] sample(int[] stream, int k) {
        int[] reservoir = new int[k];
        
        // Fill the reservoir array with the first k elements from the stream
        for (int i = 0; i < k; i++) {
            reservoir[i] = stream[i];
        }
        
        Random random = new Random();
        
        // Iterate through the remaining elements in the stream
        for (int i = k; i < stream.length; i++) {
            // Generate a random number j between 0 and i inclusive
            int j = random.nextInt(i + 1);
            
            // If j is less than k, replace the j-th element in reservoir with stream[i]
            if (j < k) {
                reservoir[j] = stream[i];
            }
        }
        
        return reservoir;
    }
    
    public static void main(String[] args) {
        int[] dataStream = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example data stream
        int k = 3; // Sample size
        
        ReservoirSampling sampler = new ReservoirSampling();
        int[] sample = sampler.sample(dataStream, k);
        
        // Print the sampled elements
        System.out.print("Sampled elements: ");
        for (int num : sample) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
