package day26_forEachLoop_constructor;

public class C06 {
    C06(){
// Bu constructor default constructor in ozelliklerine sahiptir.
        //ama bu constructor gorunur oldugundan default constructor diyemeyiz
        //bu constructor i ekledigimiz icin default constructor silinir.
    }

void C06(){
        //  bir constructor degildir
    // ama return typ i oldugundan method dur

}

//c06(){
        //invalid method declaration; return type required
    // class adi ile ayni olmadigindan constructor olamaz
    // return type'i olmadigi icin method da olamaz
    // bunun icin java altini kirmizi cizer
}
    /*
    Constructor bazi kaynaklarda ozel bir method diye gecer
    ama cogunlugun kabuluyle
    Constructor baska yapilardan farkli, kendisine ozgu bir yapidir

    constructor, constructor dir:)

    Bir kod blogunun constructor olabilmesi icin iki sarti gerceklestirmesi gerekir
    1- ismi class ismi ile ayni olmalidir
    2- return type i olmaz.
     */
