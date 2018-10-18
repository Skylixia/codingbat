/* Given an int array, return true if the array contains 2 twice, or 3 twice. 
 * The array will be length 0, 1, or 2.
 */
public boolean double23(int[] nums) {
  int count2=0;
  int count3=0;
  for(int i: nums){
  if(i==2){
    count2=count2+1;
    if(count2==2){
      return true;
    }
  }
  else if(i==3){
    count3=count3+1;
    if(count3==2){
      return true;
    }
  }
 }
    return false;
}
