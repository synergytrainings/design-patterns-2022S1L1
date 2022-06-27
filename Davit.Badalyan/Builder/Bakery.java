package Builder;

import static Builder.Measure.*;

public class Bakery {
  public static void main(String[] args) {
    YummyCake cake =
        YummyCake.builder()
            .flour(CUP)
            .sugar(CUP)
            .salt(TEASPOON)
            .bakingSoda(TEASPOON)
            .cocoa(TABLESPOONS)
            .vinegar(TABLESPOONS)
            .vanillaExtract(TEASPOON)
            .oil(TABLESPOONS)
            .water(CUP)
            .egg(3)
            .build();
    System.out.println(cake);
  }
}
