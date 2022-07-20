package day19;

import day6.Student;

public class Word implements Comparable<Word>{
    private String name;
    private Integer count;

    public Word(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public int compareTo(Word o) {

        return (this.count.compareTo(o.getCount()) != 0)
                                        ? this.count.compareTo(o.getCount())
                                                    : this.name.compareTo(o.getName());
    }
}
