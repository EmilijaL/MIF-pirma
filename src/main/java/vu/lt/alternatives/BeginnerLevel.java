package vu.lt.alternatives;

import javax.enterprise.inject.Alternative;

@Alternative
public class BeginnerLevel implements ILevel {

    @Override
    public String GameLevel() {
        return "Beginner";
    }
}
