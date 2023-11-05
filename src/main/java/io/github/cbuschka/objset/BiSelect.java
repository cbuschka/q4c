package io.github.cbuschka.objset;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface BiSelect<Element1, Element2> {

    <Element3, Key> TriSelect<Element1, Element2, Element3> join(Iterable<Element3> element3s, BiFunction<Element1, Element2, Key> key1Func, Function<Element3, Key> key2Func);

    <Element3, Key> TriSelect<Element1, Element2, Element3> leftOuterJoin(Iterable<Element3> element3s, BiFunction<Element1, Element2, Key> key1Func, Function<Element3, Key> key2Func);

    <Element3, Key> TriSelect<Element1, Element2, Element3> rightOuterJoin(Iterable<Element3> element3s, BiFunction<Element1, Element2, Key> key1Func, Function<Element3, Key> key2Func);

    <Element3, Key> TriSelect<Element1, Element2, Element3> fullOuterJoin(Iterable<Element3> element3s, BiFunction<Element1, Element2, Key> key1Func, Function<Element3, Key> key2Func);

    BiStream<Element1, Element2> stream();

    default void forEach(BiConsumer<Element1, Element2> consumer) {
        stream().forEach(consumer);
    }

    default List<Pair<Element1, Element2>> toList() {
        return tupleStream().collect(Collectors.toList());
    }

    Stream<Pair<Element1, Element2>> tupleStream();
}

