package Builder;

public class YummyCake {

  private final Measure flour;
  private final Measure sugar;
  private final Measure salt;
  private final Measure bakingSoda;
  private final Measure cocoa;
  private final Measure vinegar;
  private final Measure oil;
  private final Measure vanillaExtract;
  private final Measure water;
  private final int egg;

  YummyCake(
      Measure flour,
      Measure sugar,
      Measure salt,
      Measure bakingSoda,
      Measure cocoa,
      Measure vinegar,
      Measure oil,
      Measure vanillaExtract,
      Measure water,
      int egg) {

    this.flour = flour;
    this.sugar = sugar;
    this.salt = salt;
    this.bakingSoda = bakingSoda;
    this.cocoa = cocoa;
    this.vinegar = vinegar;
    this.oil = oil;
    this.vanillaExtract = vanillaExtract;
    this.water = water;
    this.egg = egg;
  }

  public static YummyCakeBuilder builder() {
    return new YummyCakeBuilder();
  }

  @Override
  public String toString() {
    return "YummyCake(flour="
        + this.flour
        + ", sugar="
        + this.sugar
        + ", salt="
        + this.salt
        + ", bakingSoda="
        + this.bakingSoda
        + ", cocoa="
        + this.cocoa
        + ", vinegar="
        + this.vinegar
        + ", oil="
        + this.oil
        + ", vanillaExtract="
        + this.vanillaExtract
        + ", water="
        + this.water
        + ", egg="
        + this.egg
        + ")";
  }

  public static class YummyCakeBuilder {

    private Measure flour;
    private Measure sugar;
    private Measure salt;
    private Measure bakingSoda;
    private Measure cocoa;
    private Measure vinegar;
    private Measure oil;
    private Measure vanillaExtract;
    private Measure water;
    private int egg;

    YummyCakeBuilder() {}

    public YummyCakeBuilder flour(Measure flour) {
      this.flour = flour;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder sugar(Measure sugar) {
      this.sugar = sugar;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder salt(Measure salt) {
      this.salt = salt;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder bakingSoda(Measure bakingSoda) {
      this.bakingSoda = bakingSoda;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder cocoa(Measure cocoa) {
      this.cocoa = cocoa;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder vinegar(Measure vinegar) {
      this.vinegar = vinegar;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder oil(Measure oil) {
      this.oil = oil;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder vanillaExtract(Measure vanillaExtract) {
      this.vanillaExtract = vanillaExtract;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder water(Measure water) {
      this.water = water;
      return YummyCakeBuilder.this;
    }

    public YummyCakeBuilder egg(int egg) {
      this.egg = egg;
      return YummyCakeBuilder.this;
    }

    public YummyCake build() {
      return new YummyCake(
          this.flour,
          this.sugar,
          this.salt,
          this.bakingSoda,
          this.cocoa,
          this.vinegar,
          this.oil,
          this.vanillaExtract,
          this.water,
          this.egg);
    }

    @Override
    public String toString() {
      return "YummyCake.YummyCakeBuilder(flour="
          + this.flour
          + ", sugar="
          + this.sugar
          + ", salt="
          + this.salt
          + ", bakingSoda="
          + this.bakingSoda
          + ", cocoa="
          + this.cocoa
          + ", vinegar="
          + this.vinegar
          + ", oil="
          + this.oil
          + ", vanillaExtract="
          + this.vanillaExtract
          + ", water="
          + this.water
          + ", egg="
          + this.egg
          + ")";
    }
  }
}
