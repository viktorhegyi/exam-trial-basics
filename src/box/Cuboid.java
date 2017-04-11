package box;

/**
 * Created by hegyi on 2017-04-11.
 */
public class Cuboid {
  int surface;
  int volume;
  int length;
  int breadth;
  int height;

  public Cuboid(int length, int breadth, int height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public int getSurface() {
    surface = 2 *(length * breadth + length * height + breadth * height );
    return surface;
  }

  public int getVolume() {
    volume = length * breadth * height;
    return volume;
  }
  
}