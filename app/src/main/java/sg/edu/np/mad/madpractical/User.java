package sg.edu.np.mad.madpractical;

public class User {

    public String name;
    public int id;
    public String description;
    public boolean followed;

    public User() {}

    public User(String name, int id, String description, boolean followed) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
