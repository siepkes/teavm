/*
 *  Copyright 2023 Jasper Siepkes.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.classlib.java.text;

import java.text.CollationKey;
import org.teavm.classlib.java.lang.TCloneable;
import org.teavm.classlib.java.util.TComparator;
import org.teavm.classlib.java.util.TLocale;
import org.teavm.classlib.java.util.function.TFunction;
import org.teavm.classlib.java.util.function.TToDoubleFunction;
import org.teavm.classlib.java.util.function.TToIntFunction;
import org.teavm.classlib.java.util.function.TToLongFunction;

public abstract class TCollator implements TComparator<Object>, TCloneable {

    public static synchronized TCollator getInstance() {
        // FIXME: Implement.
        return null;
    }

    public static TCollator getInstance(TLocale desiredLocale) {
        // FIXME: Implement.
        return null;
    }

    public abstract int compare(String source, String target);
    
    @Override
    public int compare(Object o1, Object o2) {
        // FIXME: Implement.
        return 0;
    }

    public abstract CollationKey getCollationKey(String source);

    public synchronized int getStrength() {
        // FIXME: Implement.
        return 0;
    }
    
    public synchronized void setStrength(int newStrength) {
        // FIXME: Implement.
    }

    public synchronized int getDecomposition() {
        // FIXME: Implement.
        return 0;
    }

    public synchronized void setDecomposition(int decompositionMode) {
        // FIXME: Implement.
    }
    
    @Override
    public TComparator<Object> reversed() {
        // FIXME: Implement.
        return TComparator.super.reversed();
    }

    @Override
    public TComparator<Object> thenComparing(TComparator<? super Object> other) {
        // FIXME: Implement.
        return TComparator.super.thenComparing(other);
    }

    @Override
    public <U> TComparator<Object> thenComparing(TFunction<? super Object, ? extends U> keyExtractor,
            TComparator<? super U> keyComparator) {
        // FIXME: Implement.
        return TComparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> TComparator<Object> thenComparing(
            TFunction<? super Object, ? extends U> keyExtractor) {
        // FIXME: Implement.
        return TComparator.super.thenComparing(keyExtractor);
    }

    @Override
    public TComparator<Object> thenComparingInt(TToIntFunction<? super Object> keyExtractor) {
        // FIXME: Implement.
        return TComparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public TComparator<Object> thenComparingLong(TToLongFunction<? super Object> keyExtractor) {
        // FIXME: Implement.
        return TComparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public TComparator<Object> thenComparingDouble(TToDoubleFunction<? super Object> keyExtractor) {
        // FIXME: Implement.
        return TComparator.super.thenComparingDouble(keyExtractor);
    }

    @Override
    public abstract int hashCode();
}
