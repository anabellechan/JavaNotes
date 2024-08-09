class Employee {
    String name
    int age
    double salary
    String location
}

public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,
                12, TreeType.OAK);
    }
}

// public class Tree {
//     double heightFt;
//     double trunkDiameterInches;
//     TreeType treeType;

//     Tree(double heightFt, double trunkDiameterInches,
//          TreeType treeType) {
//         this.heightFt = heightFt;
//         this.trunkDiameterInches = trunkDiameterInches;
//         this.treeType = treeType;
//     }

//     void grow() {
//         this.heightFt = this.heightFt + 10;
//         this.trunkDiameterInches = this.trunkDiameterInches + 1;
//     }
// }

// public enum TreeType {
//     OAK,
//     MAPLE,
//     PECAN,
//     WALNUT,
//     PINE
// }
