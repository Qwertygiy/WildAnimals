/*
 * Copyright 2017 MovingBlocks
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
package org.terasology.wildAnimals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.engine.Time;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.logic.health.BeforeDestroyEvent;
import org.terasology.registry.In;
import org.terasology.wildAnimals.component.WildAnimalComponent;


@RegisterSystem(RegisterMode.AUTHORITY)
public class DeathSystem extends BaseComponentSystem {
    private static final Logger logger = LoggerFactory.getLogger(DeathSystem.class);

    @ReceiveEvent(components = WildAnimalComponent.class)
    public void onDeath(BeforeDestroyEvent event, EntityRef entity) {
        logger.info("dead");
    }
}