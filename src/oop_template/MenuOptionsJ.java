package oop_template;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.DefaultListModel;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Parker Johnson
 */
public class MenuOptionsJ extends javax.swing.JFrame {
   
    /**
    * method will dynamically create new menu object
    * and save each text field into the menuItem 2d array
    * @param menuName
    * @param Entree1
    * @param Entree2
    * @param Entree3
    * @param Main1
    * @param Main2
    * @param Main3
    * @param Dessert1
    * @param Dessert2
    * @param Dessert3
    * @param Side1
    * @param Side2
    * @param Side3
    * @param Drink1
    * @param Drink2
    * @param Drink3 
    * @return newMenu
    * @author Parker Johnson
    * 
    */
    public Menu createNewMenu(String menuName, 
    String Entree1, 
    String Entree2,
    String Entree3,
    String Main1,
    String Main2,
    String Main3,
    String Dessert1,
    String Dessert2,
    String Dessert3,
    String Side1,
    String Side2,
    String Side3,
    String Drink1,
    String Drink2,
    String Drink3 ) {
        
        // initalise menuItems = blank 2d array
        String[][] menuItems = {{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}};
        
        // takes the data from a textfield on the jframe and then 
        // adds it to the blank 2d array
        menuItems[0][0] = Entree1;
        menuItems[0][1] = Entree2;
        menuItems[0][2] = Entree3;
        
        menuItems[1][0] = Main1;
        menuItems[1][1] = Main2;
        menuItems[1][2] = Main3;
                    
        menuItems[2][0] = Dessert1;
        menuItems[2][1] = Dessert2;
        menuItems[2][2] = Dessert3;
                    
        menuItems[3][0] = Side1;
        menuItems[3][1] = Side2;
        menuItems[3][2] = Side3;
                    
        menuItems[4][0] = Drink1;
        menuItems[4][1] = Drink2;
        menuItems[4][2] = Drink3;
         
        // create class menu
        Menu newMenu = new Menu();
        newMenu.setName(menuName);
        newMenu.setMenuItems(menuItems); 
        
        // nested for to test if data is being stored in the 2d array
        for(int i = 0; i < menuItems.length; i++) {
            for(int j = 0; j < menuItems[i].length; j++) {
                System.out.println(menuItems[i][j]);
            }
        }
        // executes writeMenu function and takes the menu as a param
        writeMenu(newMenu);
        return newMenu;
    }
    
    
    /**
     * read lines from the file to the textFields on the new/edit menu frame
     * 
     */
    public void readLines() {
        
        // execute clear fields method (clears all fields)
        clearFields();  
        
        // finds the file selected in the jList 
        // inside MenuFileStorage folder
        String filename = lstMenuFiles.getSelectedValue();
        File path = new File("MenuFileStorage/" + filename);
        
        try {
            // reads data from the file found
            BufferedReader reader = new BufferedReader(new FileReader(path));
        
            JTextField[] textFields = {jNameField, jEntreeField1, jEntreeField2,
            jEntreeField3, jMainField1, jMainField2, jMainField3, jDessertsField1,
            jDessertsField2, jDessertsField3, jSidesField1, jSidesField2,
            jSidesField3, jDrinksField1, jDrinksField2, jDrinksField3};
        
            // iterates throught the lines and reads each line to its
            // according text field
        String line;
        int i = 0;
            while ((line = reader.readLine()) !=null && i < textFields.length) {
                textFields[i].setText(line);
                i++;
            }
            reader.close();
        } catch(IOException e) {
                e.printStackTrace();
        }     
    }

    
    /**
     * writes menu fields to a folder
     * @param newMenu 
     * @return newMenu
     */
    public Menu writeMenu(Menu newMenu){
        
        // intialise foldername/path 
        // creates a new file with the menu name fields
        String foldername = "MenuFileStorage";
        String filename = jNameField.getText();
        String filepath = foldername + "/" + filename + ".txt";
         
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
            
            newMenu.getMenuItems();
            
            // writes the array to a file by each line
            bw.write(filename);
            bw.newLine();
            
            String[][] arr = newMenu.getMenuItems();
                for(int i = 0; i < arr.length; i++) {
                    for(int j = 0; j < arr[i].length; j++) {
                        bw.write(arr[i][j]);
                        bw.newLine();
                    }
                }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newMenu;
    }

    
    /**
     * clears all fields in the create new menu jFrame
     */
    private void clearFields() {
        // sets each textfield to blank
        jNameField.setText("");
        
        jEntreeField1.setText("");
        jEntreeField2.setText("");
        jEntreeField3.setText("");
        
        jMainField1.setText("");
        jMainField2.setText("");
        jMainField3.setText("");
        
        jDessertsField1.setText("");
        jDessertsField2.setText("");
        jDessertsField3.setText("");
        
        jSidesField1.setText("");
        jSidesField2.setText("");
        jSidesField3.setText("");
        
        jDrinksField1.setText("");
        jDrinksField2.setText("");
        jDrinksField3.setText("");
    }
   
    
    /**
     * Creates new form MenuOptionsJ
     */
    public MenuOptionsJ() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuOptionsPanel = new javax.swing.JPanel();
        jCreateMenu = new javax.swing.JInternalFrame();
        jCreateMenuPanel = new javax.swing.JPanel();
        lblNewMenu = new javax.swing.JLabel();
        btnNewMenuCreate = new javax.swing.JButton();
        btnNewMenuClear = new javax.swing.JButton();
        lblMains = new javax.swing.JLabel();
        lblEntrees = new javax.swing.JLabel();
        lblDesserts = new javax.swing.JLabel();
        lblSides = new javax.swing.JLabel();
        lblDrinks = new javax.swing.JLabel();
        jEntreeField1 = new javax.swing.JTextField();
        jEntreeField3 = new javax.swing.JTextField();
        jEntreeField2 = new javax.swing.JTextField();
        jMainField1 = new javax.swing.JTextField();
        jMainField2 = new javax.swing.JTextField();
        jMainField3 = new javax.swing.JTextField();
        jDessertsField1 = new javax.swing.JTextField();
        jDessertsField2 = new javax.swing.JTextField();
        jDessertsField3 = new javax.swing.JTextField();
        jSidesField1 = new javax.swing.JTextField();
        jSidesField2 = new javax.swing.JTextField();
        jSidesField3 = new javax.swing.JTextField();
        jDrinksField3 = new javax.swing.JTextField();
        jDrinksField2 = new javax.swing.JTextField();
        jDrinksField1 = new javax.swing.JTextField();
        jNameField = new javax.swing.JTextField();
        lblEnterMenu = new javax.swing.JLabel();
        jEditMenu = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        btnEditMenu = new javax.swing.JButton();
        lblMenuOptions = new javax.swing.JLabel();
        btnCreateMenu = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMenuFiles = new javax.swing.JList<>();
        btnShowFiles = new javax.swing.JButton();
        lblMenuOptions1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenuOptionsPanel.setBackground(new java.awt.Color(255, 255, 0));
        jMenuOptionsPanel.setForeground(new java.awt.Color(255, 255, 0));

        jCreateMenu.setBackground(new java.awt.Color(255, 255, 0));
        jCreateMenu.setVisible(true);

        jCreateMenuPanel.setBackground(new java.awt.Color(255, 255, 0));

        lblNewMenu.setBackground(new java.awt.Color(0, 0, 0));
        lblNewMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNewMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblNewMenu.setText("New Menu");

        btnNewMenuCreate.setBackground(new java.awt.Color(0, 0, 51));
        btnNewMenuCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewMenuCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnNewMenuCreate.setText("Create");
        btnNewMenuCreate.setToolTipText("");
        btnNewMenuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMenuCreateActionPerformed(evt);
            }
        });

        btnNewMenuClear.setBackground(new java.awt.Color(0, 0, 51));
        btnNewMenuClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewMenuClear.setForeground(new java.awt.Color(255, 255, 255));
        btnNewMenuClear.setText("Clear");
        btnNewMenuClear.setToolTipText("");
        btnNewMenuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMenuClearActionPerformed(evt);
            }
        });

        lblMains.setBackground(new java.awt.Color(0, 0, 0));
        lblMains.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMains.setForeground(new java.awt.Color(0, 0, 0));
        lblMains.setText("Mains  - Enter 3 Main items");

        lblEntrees.setBackground(new java.awt.Color(0, 0, 0));
        lblEntrees.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrees.setForeground(new java.awt.Color(0, 0, 0));
        lblEntrees.setText("Entrees - Enter 3 Entree items");

        lblDesserts.setBackground(new java.awt.Color(0, 0, 0));
        lblDesserts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDesserts.setForeground(new java.awt.Color(0, 0, 0));
        lblDesserts.setText("Desserts - Enter 3 Dessert items");

        lblSides.setBackground(new java.awt.Color(0, 0, 0));
        lblSides.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSides.setForeground(new java.awt.Color(0, 0, 0));
        lblSides.setText("Sides - Enter 3 Sides");

        lblDrinks.setBackground(new java.awt.Color(0, 0, 0));
        lblDrinks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDrinks.setForeground(new java.awt.Color(0, 0, 0));
        lblDrinks.setText("Drinks - Enter 3 Drinks");

        jEntreeField1.setBackground(new java.awt.Color(0, 0, 51));
        jEntreeField1.setForeground(new java.awt.Color(255, 255, 255));

        jEntreeField3.setBackground(new java.awt.Color(0, 0, 51));
        jEntreeField3.setForeground(new java.awt.Color(255, 255, 255));

        jEntreeField2.setBackground(new java.awt.Color(0, 0, 51));
        jEntreeField2.setForeground(new java.awt.Color(255, 255, 255));

        jMainField1.setBackground(new java.awt.Color(0, 0, 51));
        jMainField1.setForeground(new java.awt.Color(255, 255, 255));

        jMainField2.setBackground(new java.awt.Color(0, 0, 51));
        jMainField2.setForeground(new java.awt.Color(255, 255, 255));

        jMainField3.setBackground(new java.awt.Color(0, 0, 51));
        jMainField3.setForeground(new java.awt.Color(255, 255, 255));

        jDessertsField1.setBackground(new java.awt.Color(0, 0, 51));
        jDessertsField1.setForeground(new java.awt.Color(255, 255, 255));

        jDessertsField2.setBackground(new java.awt.Color(0, 0, 51));
        jDessertsField2.setForeground(new java.awt.Color(255, 255, 255));

        jDessertsField3.setBackground(new java.awt.Color(0, 0, 51));
        jDessertsField3.setForeground(new java.awt.Color(255, 255, 255));

        jSidesField1.setBackground(new java.awt.Color(0, 0, 51));
        jSidesField1.setForeground(new java.awt.Color(255, 255, 255));

        jSidesField2.setBackground(new java.awt.Color(0, 0, 51));
        jSidesField2.setForeground(new java.awt.Color(255, 255, 255));

        jSidesField3.setBackground(new java.awt.Color(0, 0, 51));
        jSidesField3.setForeground(new java.awt.Color(255, 255, 255));

        jDrinksField3.setBackground(new java.awt.Color(0, 0, 51));
        jDrinksField3.setForeground(new java.awt.Color(255, 255, 255));

        jDrinksField2.setBackground(new java.awt.Color(0, 0, 51));
        jDrinksField2.setForeground(new java.awt.Color(255, 255, 255));

        jDrinksField1.setBackground(new java.awt.Color(0, 0, 51));
        jDrinksField1.setForeground(new java.awt.Color(255, 255, 255));

        jNameField.setBackground(new java.awt.Color(0, 0, 51));
        jNameField.setForeground(new java.awt.Color(255, 255, 255));

        lblEnterMenu.setBackground(new java.awt.Color(0, 0, 0));
        lblEnterMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEnterMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblEnterMenu.setText("ENTER NEW MENU NAME :");

        jEditMenu.setBackground(new java.awt.Color(0, 0, 51));
        jEditMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jEditMenu.setForeground(new java.awt.Color(255, 255, 255));
        jEditMenu.setText("Edit");
        jEditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditMenuActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(255, 0, 0));
        jDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 255, 255));
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCreateMenuPanelLayout = new javax.swing.GroupLayout(jCreateMenuPanel);
        jCreateMenuPanel.setLayout(jCreateMenuPanelLayout);
        jCreateMenuPanelLayout.setHorizontalGroup(
            jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                        .addComponent(lblDrinks)
                        .addGap(0, 681, Short.MAX_VALUE))
                    .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                        .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                                .addComponent(lblNewMenu)
                                .addGap(121, 121, 121)
                                .addComponent(lblEnterMenu))
                            .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDrinksField3, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                .addComponent(jDrinksField2)
                                .addComponent(jDrinksField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSides, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMains, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDesserts, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEntrees, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jEntreeField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jEntreeField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jEntreeField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jMainField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jMainField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jMainField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDessertsField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDessertsField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDessertsField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSidesField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSidesField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSidesField3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                                .addComponent(jNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEditMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewMenuClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewMenuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jCreateMenuPanelLayout.setVerticalGroup(
            jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNewMenuClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewMenuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jCreateMenuPanelLayout.createSequentialGroup()
                        .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewMenu)
                            .addComponent(lblEnterMenu)
                            .addComponent(jNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEntrees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEntreeField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEntreeField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jEntreeField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMains)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMainField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMainField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jMainField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDesserts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDessertsField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDessertsField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jDessertsField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSides)
                        .addGap(3, 3, 3)
                        .addComponent(jSidesField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSidesField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSidesField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDrinks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDrinksField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDrinksField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jDrinksField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCreateMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCreateMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnEditMenu.setBackground(new java.awt.Color(0, 0, 51));
        btnEditMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnEditMenu.setText("Edit");
        btnEditMenu.setToolTipText("");

        javax.swing.GroupLayout jCreateMenuLayout = new javax.swing.GroupLayout(jCreateMenu.getContentPane());
        jCreateMenu.getContentPane().setLayout(jCreateMenuLayout);
        jCreateMenuLayout.setHorizontalGroup(
            jCreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCreateMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jCreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jCreateMenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEditMenu)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jCreateMenuLayout.setVerticalGroup(
            jCreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreateMenuLayout.createSequentialGroup()
                .addComponent(jCreateMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jCreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jCreateMenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEditMenu)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        lblMenuOptions.setBackground(new java.awt.Color(0, 0, 0));
        lblMenuOptions.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenuOptions.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuOptions.setText("Menu Options");

        btnCreateMenu.setBackground(new java.awt.Color(0, 0, 51));
        btnCreateMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateMenu.setText("Create New Menu");
        btnCreateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMenuActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lstMenuFiles.setBackground(new java.awt.Color(0, 0, 51));
        lstMenuFiles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lstMenuFiles.setForeground(new java.awt.Color(255, 255, 255));
        lstMenuFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMenuFilesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstMenuFiles);

        btnShowFiles.setBackground(new java.awt.Color(0, 0, 51));
        btnShowFiles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnShowFiles.setForeground(new java.awt.Color(255, 255, 255));
        btnShowFiles.setText("Show FIles");
        btnShowFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFilesActionPerformed(evt);
            }
        });

        lblMenuOptions1.setBackground(new java.awt.Color(0, 0, 0));
        lblMenuOptions1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenuOptions1.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuOptions1.setText("Edit Menu");

        javax.swing.GroupLayout jMenuOptionsPanelLayout = new javax.swing.GroupLayout(jMenuOptionsPanel);
        jMenuOptionsPanel.setLayout(jMenuOptionsPanelLayout);
        jMenuOptionsPanelLayout.setHorizontalGroup(
            jMenuOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuOptionsPanelLayout.createSequentialGroup()
                .addGroup(jMenuOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jMenuOptionsPanelLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(lblMenuOptions))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuOptionsPanelLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jMenuOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCreateMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jMenuOptionsPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblMenuOptions1))
                    .addGroup(jMenuOptionsPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jMenuOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShowFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jCreateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jMenuOptionsPanelLayout.setVerticalGroup(
            jMenuOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCreateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jMenuOptionsPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblMenuOptions)
                .addGap(30, 30, 30)
                .addComponent(btnCreateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMenuOptions1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowFiles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * uses create menu button to make a 'default' menu
     * @param evt 
     */
    private void btnCreateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMenuActionPerformed

        jNameField.setText("MenuName");
     
    }//GEN-LAST:event_btnCreateMenuActionPerformed

    
    /**
     * lets the user go back to staff page
     * @param evt 
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      
        StaffOptions staff = new StaffOptions();
        staff.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    
    /**
     * creates a new menu class from method and passes all the text fields
     * @param evt 
     */
    private void btnNewMenuCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMenuCreateActionPerformed
        // if statement checks if the field has any data and 
        // if blank will shows and option pane that says blank
        if(!jNameField.getText().equals("") &&
                !jEntreeField1.getText().equals("") &&
                !jEntreeField2.getText().equals("") &&
                !jEntreeField3.getText().equals("") &&
                !jMainField1.getText().equals("") &&
                !jMainField2.getText().equals("") &&
                !jMainField3.getText().equals("") &&
                !jDessertsField1.getText().equals("") &&
                !jDessertsField2.getText().equals("") &&
                !jDessertsField3.getText().equals("") &&
                !jSidesField1.getText().equals("") &&
                !jSidesField2.getText().equals("") &&
                !jSidesField3.getText().equals("") &&
                !jDrinksField1.getText().equals("") &&
                !jDrinksField2.getText().equals("") &&
                !jDrinksField3.getText().equals("")) { 
        
        String Entree1 = jEntreeField1.getText();
        String Entree2 = jEntreeField2.getText();
        String Entree3 = jEntreeField3.getText();
        String Main1 = jMainField1.getText();
        String Main2 = jMainField2.getText();
        String Main3 = jMainField3.getText();
        String Dessert1 = jDessertsField1.getText();
        String Dessert2 = jDessertsField2.getText();
        String Dessert3 = jDessertsField3.getText();
        String Side1 = jSidesField1.getText();
        String Side2 = jSidesField2.getText();
        String Side3 = jSidesField3.getText();
        String Drink1 = jDrinksField1.getText();
        String Drink2 = jDrinksField2.getText();
        String Drink3 = jDrinksField3.getText();
        
        String name = jNameField.getText();
        
        // create menu file and passes the text field
        // variables as parameters
        createNewMenu( name,
            Entree1,
            Entree2,
            Entree3,
            Main1,
            Main2,
            Main3,
            Dessert1,
            Dessert2,
            Dessert3,
            Side1,
            Side2,
            Side3,
            Drink1,
            Drink2,
            Drink3);   
        JOptionPane.showMessageDialog(null, "MENU CREATED!");
        
        // will update the jList for the menu files
        // and then clear the textFields :)
        showFiles();
        clearFields();
        
        } else {
            JOptionPane.showMessageDialog(null, "ENTER DATA!");
        }
        
    }//GEN-LAST:event_btnNewMenuCreateActionPerformed
    
    
    /**
     * pulls files/file names and adds them to a jList
     */
    public void showFiles() {
        
        DefaultListModel model = new DefaultListModel();
        File path = new File("MenuFileStorage");
        
        // uses the menuFileStorage folder to get text 
        // files created by user and adds them to the jList
        File[] filelist = path.listFiles();
            for(File f : filelist) {
                model.addElement(f.getName());
            }
            lstMenuFiles.setModel(model);
    }

    
    /**
     * allows the user to clear all fields
     * @param evt 
     */
    private void btnNewMenuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMenuClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnNewMenuClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    
    /**
     * executes showFils method
     * @param evt 
     */
    private void btnShowFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFilesActionPerformed
        showFiles();
    }//GEN-LAST:event_btnShowFilesActionPerformed

    
    /**
     * will execute the readLines method
     * @param evt 
     */
    private void lstMenuFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMenuFilesMouseClicked
        readLines();
    }//GEN-LAST:event_lstMenuFilesMouseClicked

    
    /**
     * save data from text fields the file selected is edited 
     * @param evt 
     */
    private void jEditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditMenuActionPerformed
        
        // checks if the textfields have data (doesnt run if not)
    if(!jNameField.getText().equals("") &&
        !jEntreeField1.getText().equals("") &&
        !jEntreeField2.getText().equals("") &&
        !jEntreeField3.getText().equals("") &&
        !jMainField1.getText().equals("") &&
        !jMainField2.getText().equals("") &&
        !jMainField3.getText().equals("") &&
        !jDessertsField1.getText().equals("") &&
        !jDessertsField2.getText().equals("") &&
        !jDessertsField3.getText().equals("") &&
        !jSidesField1.getText().equals("") &&
        !jSidesField2.getText().equals("") &&
        !jSidesField3.getText().equals("") &&
        !jDrinksField1.getText().equals("") &&
        !jDrinksField2.getText().equals("") &&
        !jDrinksField3.getText().equals("")) {
        
            int option = JOptionPane.showConfirmDialog(null, "CONFIRM EDIT...", "EDIT MENU", JOptionPane.YES_NO_OPTION);
                
            // similar to create menu method but deletes selected
            // menu file and then recreates it with the edits
            if (option == 0) {    
                String foldername = "MenuFileStorage";
                String filename = jNameField.getText();
                String filepath = foldername + "/" + filename + ".txt";
                File file = new File(filepath);
                file.delete();

                    String Entree1 = jEntreeField1.getText();
                    String Entree2 = jEntreeField2.getText();
                    String Entree3 = jEntreeField3.getText();
                    String Main1 = jMainField1.getText();
                    String Main2 = jMainField2.getText();
                    String Main3 = jMainField3.getText();
                    String Dessert1 = jDessertsField1.getText();
                    String Dessert2 = jDessertsField2.getText();
                    String Dessert3 = jDessertsField3.getText();
                    String Side1 = jSidesField1.getText();
                    String Side2 = jSidesField2.getText();
                    String Side3 = jSidesField3.getText();
                    String Drink1 = jDrinksField1.getText();
                    String Drink2 = jDrinksField2.getText();
                    String Drink3 = jDrinksField3.getText();

                    String name = jNameField.getText();

                    // create new menu method to recreate the menu
                    createNewMenu( name,
                        Entree1,
                        Entree2,
                        Entree3,
                        Main1,
                        Main2,
                        Main3,
                        Dessert1,
                        Dessert2,
                        Dessert3,
                        Side1,
                        Side2,
                        Side3,
                        Drink1,
                        Drink2,
                        Drink3);

                    JOptionPane.showMessageDialog(null, "MENU SUCCESSFULLY EDITD!");
                    clearFields();
                    showFiles();
                } else {
                    JOptionPane.showMessageDialog(null, "COULDNT EDIT MENU!");
                }
    } else {
        JOptionPane.showMessageDialog(null, "ENTER DATA!");
    }
    }//GEN-LAST:event_jEditMenuActionPerformed
    
    
    /**
     * deletes selected file from list
     * @param evt 
     */
    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        
        int option = JOptionPane.showConfirmDialog(null, "CONFIRM DELETE...", "DELETE MENU", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            // finds the selected file from the list and then 
            // deletes it from the menuFileStorage folder
            String foldername = "MenuFileStorage";
            String filename = jNameField.getText();
            String filepath = foldername + "/" + filename + ".txt";
            File file = new File(filepath);
            file.delete();
            clearFields();
            JOptionPane.showMessageDialog(null, "MENU SUCCESSFULLY DELETED!");
        } else {
            JOptionPane.showMessageDialog(null, "COULDNT DELETE MENU!");
        }
        showFiles();
    }//GEN-LAST:event_jDeleteActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuOptionsJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOptionsJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOptionsJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOptionsJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOptionsJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateMenu;
    private javax.swing.JButton btnEditMenu;
    private javax.swing.JButton btnNewMenuClear;
    private javax.swing.JButton btnNewMenuCreate;
    private javax.swing.JButton btnShowFiles;
    private javax.swing.JInternalFrame jCreateMenu;
    private javax.swing.JPanel jCreateMenuPanel;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jDessertsField1;
    private javax.swing.JTextField jDessertsField2;
    private javax.swing.JTextField jDessertsField3;
    private javax.swing.JTextField jDrinksField1;
    private javax.swing.JTextField jDrinksField2;
    private javax.swing.JTextField jDrinksField3;
    private javax.swing.JButton jEditMenu;
    private javax.swing.JTextField jEntreeField1;
    private javax.swing.JTextField jEntreeField2;
    private javax.swing.JTextField jEntreeField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jMainField1;
    private javax.swing.JTextField jMainField2;
    private javax.swing.JTextField jMainField3;
    private javax.swing.JPanel jMenuOptionsPanel;
    private javax.swing.JTextField jNameField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSidesField1;
    private javax.swing.JTextField jSidesField2;
    private javax.swing.JTextField jSidesField3;
    private javax.swing.JLabel lblDesserts;
    private javax.swing.JLabel lblDrinks;
    private javax.swing.JLabel lblEnterMenu;
    private javax.swing.JLabel lblEntrees;
    private javax.swing.JLabel lblMains;
    private javax.swing.JLabel lblMenuOptions;
    private javax.swing.JLabel lblMenuOptions1;
    private javax.swing.JLabel lblNewMenu;
    private javax.swing.JLabel lblSides;
    private javax.swing.JList<String> lstMenuFiles;
    // End of variables declaration//GEN-END:variables
}
