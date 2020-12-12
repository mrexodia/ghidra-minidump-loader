/* ###
 * IP: GHIDRA
 * REVIEWED: YES
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.jubjubnest.minidump.contrib.pe.debug;

/**
 * 
 */
class S_BLOCK32 extends DebugSymbol {

	static S_BLOCK32 createS_BLOCK32(short length, short type) {
        return new S_BLOCK32(length, type);
    }

    private S_BLOCK32(short length, short type) {
		processDebugSymbol(length, type);
	}

}
