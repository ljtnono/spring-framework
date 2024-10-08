/*
 * Copyright 2002-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.test.context.bean.override.mockito;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.mockito.quality.Strictness;

/**
 * Configure a test class that uses {@link MockitoBean @MockitoBean} or
 * {@link MockitoSpyBean @MockitoSpyBean} to set up Mockito with an explicit
 * stubbing strictness mode.
 *
 * @author Simon Baslé
 * @since 6.2
 * @see MockitoTestExecutionListener
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MockitoBeanSettings {

	/**
	 * The stubbing strictness mode to apply for all Mockito mocks in the annotated
	 * test class.
	 */
	Strictness value();

}
