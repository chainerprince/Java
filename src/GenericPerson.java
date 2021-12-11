public class GenericPerson<K,P> {
    private K age;
    private P gender;

    public GenericPerson(K age,P gender){
        this.age = age;
        this.gender = gender;

    }
    public K getAge() {
        return age;
    }

    public void setAge(K age) {
        this.age = age;
    }

    public P getGender() {
        return gender;
    }

    public void setGender(P gender) {
        this.gender = gender;
    }
}
