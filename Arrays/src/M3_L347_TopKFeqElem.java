import java.util.*;
public class M3_L347_TopKFeqElem {

    /*As the question demands to use PriorityQueue as we reach to the
    * limiations of hashMap and sort the map values as the are occurences
    * and then get the key but what is dup?
    * need to evolve so -->
    * */
    public static void understandPriorityQueue(){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(10);
        minHeap.add(3);

        System.out.println("Top element (smallest): " + minHeap.peek()); //1

        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " "); // 1 3 5 10
        }
        System.out.println();
    }
    public static int[] topKFrequentOptimalSol(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        // Step 2: Min-heap to keep top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k)
                minHeap.poll(); // remove least frequent
        }

        // Step 3: Extract keys from heap
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty())
            result[i++] = minHeap.poll().getKey();

        return result;
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> valueMap = new TreeMap<>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
           valueMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(map);

        int[] arr = list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();

        return arr;

    }

    public static void main(String[] args){

        int[] nums = {1,2,2,3,3,3,4,4,4,4};
        int k = 2;
        understandPriorityQueue();
        System.out.println(Arrays.toString(topKFrequentOptimalSol(nums,k)));

    }
}
