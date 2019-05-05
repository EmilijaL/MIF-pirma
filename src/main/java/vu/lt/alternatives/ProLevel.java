package vu.lt.alternatives;

import javax.enterprise.inject.Alternative;

@Alternative
public class ProLevel implements ILevel {
    @Override
    public String GameLevel() {
        return "Pro";
    }
}
