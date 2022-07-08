package com.syntax.class20;

public class Task3 {
    public static void main(String[] args) {
        ScienceTeacher scienceTeacher = new ScienceTeacher();
        scienceTeacher.name = "Adem";
        scienceTeacher.favoriteScienceSubject = "Chemistry";
        scienceTeacher.teachesScience();

        MusicTeacher musicTeacher = new MusicTeacher();
        musicTeacher.name = "Keys";
        musicTeacher.favoriteInstrument = "Piano";
        musicTeacher.teachesMusic();
    }
}


class Teacher {
    String name;
    String subject;

    public void Teach() {
        System.out.println(name+" teaches "+subject);
    }
}
class MathTeacher extends Teacher{
    String favoriteMathSubject;

    public void TeachesMath() {
        System.out.println(name+" teaches math and his favorite math subject is "+favoriteMathSubject);
    }
}
class ScienceTeacher extends Teacher{
    String favoriteScienceSubject;

    public void teachesScience(){
        System.out.println(name+" teaches science and his favorite science subject is "+favoriteScienceSubject);
    }
}
class MusicTeacher extends Teacher{
    String favoriteInstrument;

    public void teachesMusic() {
        System.out.println(name+" teaches music and her favorite instrument is "+favoriteInstrument);
    }

}
//Example of hierarchical inheritance
