public class Child extends Person {

  Parent parent1;
  Parent parent2;
  Child[] siblings = new Child[0];

  public Child(String name, int age, Parent parent1, Parent parent2) {
    super(name, age);
    this.parent1 = parent1;
    this.parent2 = parent2;
  }

  public Parent getParent1() {
    return this.parent1;
  }

  public Parent getParent2() {
    return this.parent2;
  }

  public void setParent1(Parent parents) {
    this.parent1 = parent;
  }

  public void setParent2(Parent parents) {
    this.parent2 = parent;
  }

  public Child[] getSiblings() {
    return this.siblings;
  }

  public void setSiblings(Child[] siblings) {
    this.siblings = siblings;
  }

  public void addSibling(Child child) {
    Child[] newSiblings = new Child[this.siblings.length + 1];
    for (int i = 0; i < this.siblings.length; i++) {
      newSiblings[i] = this.siblings[i];
    }
    newSiblings[newSiblings.length - 1] = child;
    this.siblings = newSiblings;
  }

}
