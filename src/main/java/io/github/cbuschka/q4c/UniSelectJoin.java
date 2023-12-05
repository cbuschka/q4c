package io.github.cbuschka.q4c;

import java.util.function.Function;

public interface UniSelectJoin<Element1, Element2> {
    <Key> FilterableBiSelect<Element1, Element2> on(Function<Element1, Key> element1KeyFunc, Function<Element2, Key> element2KeyFunc);

    <Key> FilterableBiSelect<Element1, Element2> on(Function<Element1, Key> element1KeyFunc, Function<Element2, Key> element2KeyFunc,
                                                    BiPredicate<Element1, Element2> condition);
}
