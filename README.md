# dsea-lafore
## Data Structures and Algorithms (DS&A) in Java
#### This is a simple project for educational purposes of teaching data structures and algorithms in java based on Robert Lafore's Book "Data Structures and Algorithms in Java - 2nd Edition".

<div align="center">
  <img src="https://m.media-amazon.com/images/I/41W+LyRF6NL.jpg" alt="Data Structures & Algorithms in Java - Robert Lafore (book image)"/>
</div>

<hr>

## Structure

The project uses a very simple structure:
- 2 packages to separate Data Structures classes and Algorithms classes
- A utils package with DisplayUtil class with a method to display a nice visual presentation for each algorithm used in the main class
- A main class for general purposes

The project was created using Intellij IDEA Ultimate as IDE, Maven as build tool and Oracle JDK 17.0.6.

<hr>

## Examples

- #### Array (Data Structure)

```
public class Array {
    private int[] values;

    public Array(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public void display() {
        for (int value : values) {
            System.out.print(value);
        }
        System.out.println("\n");
    }
        
    public boolean isSorted() {
        for(int i = 0; i < this.getValues().length-1; i++) {
            if(this.getValues()[i+1] < this.getValues()[i]) return false;
        }
        return true;
    }
}
```

- #### Bubble Sort (Algorithm)

```
  public class BubbleSort extends Algorithm {
  
    public BubbleSort() {
    this.setName("BUBBLE SORT");
    this.setComplexity(ComplexityEnum.ON2);
    }

  public static void sort(Array array) {
  for (int i = array.getValues().length-1; i > 0; i--) {
    for(int j = 0; j < i; j++) {
      if(array.getValues()[j] > array.getValues()[j+1]) {
          int temp = array.getValues()[j+1];
          array.getValues()[j+1] = array.getValues()[j];
          array.getValues()[j] = temp;
      }
    }
  }
  }
  } 
  
```

<hr>

For any questions, I make available my email: allanrizza.dev@gmail.com