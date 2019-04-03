/*
 * Copyright (C) 2017 The Android Open Source Project
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
 *//*


package com.example.hearthstoneapi.database;


import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;


@Entity(tableName = "Cards")
public class CardEntry {
    @PrimaryKey(autoGenerate = true)

    private int manaCost, id;
    private String rarity, type, set, cardClass;


    @Ignore
    public CardEntry(int manaCost, String rarity, String type, String set, String cardClass) {
        this.manaCost = manaCost;
        this.rarity = rarity;
        this.type = type;
        this.set = set;
        this.cardClass = cardClass;
    }

    public CardEntry(int id, int manaCost, String rarity, String type, String set, String cardClass) {
        this.id = id;
        this.manaCost = manaCost;
        this.rarity = rarity;
        this.type = type;
        this.set = set;
        this.cardClass = cardClass;
    }


    public int getId()
    {
        return id;
    }

    public int getCardManaCost()
    {
        return manaCost;
    }

    public String getCardRarity()
    {
        return rarity;
    }

    public String getCardType()
    {
        return type;
    }

    public String getCardSet()
    {
        return set;
    }

    public String getCardClass()
    {
        return cardClass;
    }


}



*/
