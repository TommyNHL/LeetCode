import java.util.Arrays;

class Q706_DesignHashMap {
  int[] data;

  public Q706_DesignHashMap() {
    data = new int[1000001];
    Arrays.fill(data, -1);
  }

  public void put(int key, int val) {
    data[key] = val;
  }
  
  public int get(int key) {
    return data[key];
  }
  
  public void remove(int key) {
    data[key] = -1;
  }
}