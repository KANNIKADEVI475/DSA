public class intervalIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0,j=0;
        List<List<Integer>> list=new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
if(firstList[i][0] > secondList[j][1]){
    j++;
}
else if(firstList[i][1]< secondList[j][0]){
    i++;
}
else{
    int start=Math.max(firstList[i][0],secondList[j][0]);
    int end=Math.min(firstList[i][1],secondList[j][1]);
    list.add(new ArrayList<Integer>(Arrays.asList(start,end)));
    if(end==firstList[i][1]){
        i++;
    }
    else{
        j++;
    }
}

        }
        int nums[][]=new int[list.size()][2];
        for(int k=0;k<list.size();k++){
nums[k][0]=list.get(k).get(0);
nums[k][1]=list.get(k).get(1);
        }
        return nums;
    }
}
// There are only 3 possibilities between two intervals:

// First interval is completely after second interval.
// First interval is completely before second interval.
// Otherwise, they overlap.
// Algorithm:

// Initialize p1 = 0 and p2 = 0.

// While both pointers are valid:

// If first[p1].start > second[p2].end:
// Move p2.

// Else if first[p1].end < second[p2].start:
// Move p1.

// Else:
// Overlap exists.
// start = max(starts)
// end = min(ends)
// Add [start, end].
