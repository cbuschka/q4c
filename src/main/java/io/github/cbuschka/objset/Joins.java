package io.github.cbuschka.objset;

import io.github.cbuschka.objset.impl.JoinIterator;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

import static io.github.cbuschka.objset.impl.JoinIterator.JoinMode.FULL_OUTER;
import static io.github.cbuschka.objset.impl.JoinIterator.JoinMode.INNER;
import static io.github.cbuschka.objset.impl.JoinIterator.JoinMode.LEFT_OUTER;
import static io.github.cbuschka.objset.impl.JoinIterator.JoinMode.RIGHT_OUTER;

public class Joins {

    @Deprecated
    public static <Element1, Element2, Key, Result> Iterable<Result> innerJoin(Iterable<Element1> left,
                                                                               Function<Element1, Key> element1KeyFunc,
                                                                               Iterable<Element2> right,
                                                                               Function<Element2, Key> element2KeyFunc,
                                                                               BiFunction<Element1, Element2, Result> mapFunction) {
        return innerJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> innerJoin(Stream<Element1> left,
                                                                               Function<Element1, Key> element1KeyFunc,
                                                                               Stream<Element2> right,
                                                                               Function<Element2, Key> element2KeyFunc,
                                                                               BiFunction<Element1, Element2, Result> mapFunction) {
        return innerJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }


    public static <Element1, Element2, Key, Result> Iterable<Result> innerJoin(Iterator<Element1> left,
                                                                               Function<Element1, Key> element1KeyFunc,
                                                                               Iterator<Element2> right,
                                                                               Function<Element2, Key> element2KeyFunc,
                                                                               BiFunction<Element1, Element2, Result> mapFunction) {
        return JoinIterator.wrap(INNER, left, element1KeyFunc, right, element2KeyFunc, mapFunction);
    }

    @Deprecated
    public static <Element1, Element2, Key, Result> Iterable<Result> leftOuterJoin(Iterable<Element1> left,
                                                                                   Function<Element1, Key> element1KeyFunc,
                                                                                   Iterable<Element2> right,
                                                                                   Function<Element2, Key> element2KeyFunc,
                                                                                   BiFunction<Element1, Element2, Result> mapFunction) {
        return leftOuterJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> leftOuterJoin(Stream<Element1> left,
                                                                                   Function<Element1, Key> element1KeyFunc,
                                                                                   Stream<Element2> right,
                                                                                   Function<Element2, Key> element2KeyFunc,
                                                                                   BiFunction<Element1, Element2, Result> mapFunction) {
        return leftOuterJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> leftOuterJoin(Iterator<Element1> left,
                                                                                   Function<Element1, Key> element1KeyFunc,
                                                                                   Iterator<Element2> right,
                                                                                   Function<Element2, Key> element2KeyFunc,
                                                                                   BiFunction<Element1, Element2, Result> mapFunction) {
        return JoinIterator.wrap(LEFT_OUTER, left, element1KeyFunc, right, element2KeyFunc, mapFunction);
    }

    @Deprecated
    public static <Element1, Element2, Key, Result> Iterable<Result> rightOuterJoin(Iterable<Element1> left,
                                                                                    Function<Element1, Key> element1KeyFunc,
                                                                                    Iterable<Element2> right,
                                                                                    Function<Element2, Key> element2KeyFunc,
                                                                                    BiFunction<Element1, Element2, Result> mapFunction) {
        return rightOuterJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> rightOuterJoin(Stream<Element1> left,
                                                                                    Function<Element1, Key> element1KeyFunc,
                                                                                    Stream<Element2> right,
                                                                                    Function<Element2, Key> element2KeyFunc,
                                                                                    BiFunction<Element1, Element2, Result> mapFunction) {
        return rightOuterJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> rightOuterJoin(Iterator<Element1> left,
                                                                                    Function<Element1, Key> element1KeyFunc,
                                                                                    Iterator<Element2> right,
                                                                                    Function<Element2, Key> element2KeyFunc,
                                                                                    BiFunction<Element1, Element2, Result> mapFunction) {
        return JoinIterator.wrap(RIGHT_OUTER, left, element1KeyFunc, right, element2KeyFunc, mapFunction);
    }

    @Deprecated
    public static <Element1, Element2, Key, Result> Iterable<Result> fullOuterJoin(Iterable<Element1> left,
                                                                                   Function<Element1, Key> element1KeyFunc,
                                                                                   Iterable<Element2> right,
                                                                                   Function<Element2, Key> element2KeyFunc,
                                                                                   BiFunction<Element1, Element2, Result> mapFunction) {
        return fullOuterJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> fullOuterJoin(Stream<Element1> left,
                                                                                   Function<Element1, Key> element1KeyFunc,
                                                                                   Stream<Element2> right,
                                                                                   Function<Element2, Key> element2KeyFunc,
                                                                                   BiFunction<Element1, Element2, Result> mapFunction) {
        return fullOuterJoin(left.iterator(), element1KeyFunc, right.iterator(), element2KeyFunc, mapFunction);
    }

    public static <Element1, Element2, Key, Result> Iterable<Result> fullOuterJoin(Iterator<Element1> left,
                                                                                   Function<Element1, Key> element1KeyFunc,
                                                                                   Iterator<Element2> right,
                                                                                   Function<Element2, Key> element2KeyFunc,
                                                                                   BiFunction<Element1, Element2, Result> mapFunction) {
        return JoinIterator.wrap(FULL_OUTER, left, element1KeyFunc, right, element2KeyFunc, mapFunction);
    }
}
