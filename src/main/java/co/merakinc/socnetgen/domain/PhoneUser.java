package co.merakinc.socnetgen.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@NodeEntity(label = "User")
public class PhoneUser {

    @Id
    @GeneratedValue
    private Long id;

    private String cellNumber;

    private GSCoordinates aggCoordinates;

    @Relationship(type="NEIGHBOR", direction=Relationship.UNDIRECTED)
    private Set<PhoneUser> neighbors = new HashSet<>();

    @Relationship(type="FRIEND", direction = Relationship.UNDIRECTED)
    private Set<PhoneUser> friends = new HashSet<>();

    private String stringifyRelatives(Set<PhoneUser> relatives) {
        return Optional.ofNullable(this.neighbors)
                .orElse(Collections.emptySet())
                .stream()
                .map(PhoneUser::getCellNumber)
                .collect(Collectors.toList())
                .toString();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", cellNumber='" + cellNumber + '\'' +
                ", aggCoordinates=" + aggCoordinates.toString() +
                ", neighbor=" + this.stringifyRelatives(this.neighbors) +
                ", friend=" + this.stringifyRelatives(this.friends) +
                '}';
    }

    public Boolean addFriend(PhoneUser friend) {
        return this.friends.add(friend);
    }

    public Boolean addNeighbor(PhoneUser neighbor) {
        return this.neighbors.add(neighbor);
    }

    public Boolean removeFriend(PhoneUser friend) {
        return this.friends.remove(friend);
    }

    public Boolean removeNeighbor(PhoneUser neighbor) {
        return this.neighbors.remove(neighbor);
    }

    //Required for Neo4j API
    public PhoneUser() {
    }

    public PhoneUser(String cellNumber) {
        this.cellNumber = cellNumber;
    }


    public Long getId() {
        return id;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public GSCoordinates getAggCoordinates() {
        return aggCoordinates;
    }

    public Set<PhoneUser> getNeighbors() {
        return neighbors;
    }

    public Set<PhoneUser> getFriends() {
        return friends;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setAggCoordinates(GSCoordinates aggCoordinates) {
        this.aggCoordinates = aggCoordinates;
    }
}