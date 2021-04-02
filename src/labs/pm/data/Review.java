/*
 * Copyright (C) 2021 Hardil
 *
 * This program is free software: you can redistribute it and/or modify
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
package labs.pm.data;

import java.io.Serializable;

/**
 *
 * @author Hardil
 */
public class Review implements Comparable<Review>, Serializable {

    private String comments;
    private Rating rating;

    public Review(String comments, Rating rating) {
        this.comments = comments;
        this.rating = rating;
    }

    /**
     * Get the value of rating
     *
     * @return the value of rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Get the value of comments
     *
     * @return the value of comments
     */
    public String getComments() {
        return comments;
    }    

    @Override
    public String toString() {
        return "Review{" + "comments=" + comments + ", rating=" + rating + '}';
    }

    @Override
    public int compareTo(Review other) {
      return other.rating.ordinal() - this.rating.ordinal();
    }
    

}
