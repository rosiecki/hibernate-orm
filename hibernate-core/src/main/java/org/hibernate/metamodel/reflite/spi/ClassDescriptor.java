/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2014, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.reflite.spi;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.jboss.jandex.AnnotationInstance;
import org.jboss.jandex.DotName;

/**
 * Describes a java type that represents a class definition.
 *
 * @author Steve Ebersole
 */
public interface ClassDescriptor extends JavaTypeDescriptor {
	/**
	 * Did the class define a default (no-arg) constructor?
	 *
	 * @return {@code true} indicates the class did have a default (no arg) constructor.
	 */
	public boolean hasDefaultConstructor();

	/**
	 * The super type for this type (if it is a class)
	 *
	 * @return The super type
	 */
	public ClassDescriptor getSuperType();

	/**
	 * Get the interfaces implemented by this type
	 *
	 * @return The implemented interfaces
	 */
	public Collection<InterfaceDescriptor> getInterfaceTypes();

	/**
	 * Get the annotations defined on this type.
	 *
	 * @return The annotations.
	 */
	public Map<DotName, AnnotationInstance> getAnnotations();

	/**
	 * Get any parameters defined on the type.
	 *
	 * @return Any type parameters.
	 */
	public List<JavaTypeDescriptor> getTypeParameters();
}
