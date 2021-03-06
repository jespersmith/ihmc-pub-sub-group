/**
 * Copyright 2018 Florida Institute for Human and Machine Cognition (IHMC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.ihmc.idl.serializers.extra;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Interface to add custom deserialization routines to the AbstractSerializer
 * 
 * The use case is to migrate away from custom formats to formats defined in .idl files
 * 
 * @author Jesper Smith
 *
 * @param <T>
 */
public interface  CustomDeserializationHandler<T>
{
   /**
    * Callback function to do custom deserialization
    * 
    * @param node The JSON node read from the data
    * @param data The data after standard deserialization
    */
   public void handle(JsonNode node, T data);
}
