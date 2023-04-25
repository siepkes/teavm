/*
 *  Copyright 2023 Alexey Andreev.
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
package org.teavm.restructurization;

import java.util.List;
import org.teavm.model.Variable;

public class SwitchBlock extends Block {
    Variable condition;
    List<SwitchBlockEntry> entries;
    Block defaultBlock;

    public Variable getCondition() {
        return condition;
    }

    public List<? extends SwitchBlockEntry> getEntries() {
        return entries;
    }

    public Block getDefaultBlock() {
        return defaultBlock;
    }
}
