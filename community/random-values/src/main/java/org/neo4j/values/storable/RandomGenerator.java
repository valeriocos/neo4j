/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.values.storable;

import java.util.Random;

public class RandomGenerator implements Generator
{
    private final Random random;

    public RandomGenerator( Random random )
    {
        this.random = random;
    }

    @Override
    public long nextLong()
    {
        return random.nextLong();
    }

    @Override
    public boolean nextBoolean()
    {
        return random.nextBoolean();
    }

    @Override
    public int nextInt()
    {
        return random.nextInt();
    }

    @Override
    public int nextInt( int bound )
    {
        return random.nextInt( bound );
    }

    @Override
    public float nextFloat()
    {
        return random.nextFloat();
    }

    @Override
    public double nextDouble()
    {
        return random.nextDouble();
    }
}
