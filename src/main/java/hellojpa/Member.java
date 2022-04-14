package hellojpa;

import javax.persistence.*;

@Entity
@TableGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        table = "MY_SEQUENCES",
        pkColumnValue = "MEMBER_SEQ", allocationSize = 50)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "MEMBER_SEQ_GENERATOR")
    private Long id;

    @Column(name = "name", nullable = false)
    private String username;

    public Member() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}






//@Entity
//public class Member {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "MEMBER_ID")
//    private Long id;
//
//    @Column(name = "USERNAME")
//    private String username;
//
//    @Embedded
//    private Address homeAddress;
//
//    @ElementCollection
//    @CollectionTable(name = "FAVORITE_FOOD", joinColumns =
//    @JoinColumn(name = "MEMBER_ID")
//    )
//    @Column(name = "FOOD_NAME")
//    private Set<String> favoriteFoods = new HashSet<>();
//
////    @ElementCollection
////    @CollectionTable(name = "ADDRESS", joinColumns =
////        @JoinColumn(name = "MEMBER_ID")
////    )
////    private List<Address> addressHistory = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "MEMBER_ID")
//    private List<AddressEntity> addressHistory = new ArrayList<>();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//
//    public Set<String> getFavoriteFoods() {
//        return favoriteFoods;
//    }
//
//    public void setFavoriteFoods(Set<String> favoriteFoods) {
//        this.favoriteFoods = favoriteFoods;
//    }
//
//    public List<AddressEntity> getAddressHistory() {
//        return addressHistory;
//    }
//
//    public void setAddressHistory(List<AddressEntity> addressHistory) {
//        this.addressHistory = addressHistory;
//    }
//}
