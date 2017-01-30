package GUI.swing;

import army.UnitAdd;
import army.Mage;
import army.Warrior;
import army.Worker;
import economy.actions.build.AllBuildActions;
import economy.buildings.mines.GoldMine;
import economy.buildings.mines.IronMine;
import economy.buildings.farms.MilkFarm;
import economy.food.Food;
import economy.resources.Gold;
import economy.resources.Iron;
import timers.EnemyTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class MainWindow {
    public JFrame frame;

    private static JTextField foodCount;
    private static JTextField goldMines;
    private static JTextField ironMines;

    private static JTextField textFieldWarrior;
    private static JTextField textFieldGold;
    private static JTextField textFieldMage;
    private static JTextField textFieldIron;
    private static JTextField textFieldWorker;
    private static JTextField upgradetGoldMines;
    private static JTextField milkFarms;
    private static JTextField enemyTimeTextField;


    private static JLabel systemMessage;
    public static JLabel food;

    static JButton btnAddGm;


    private static JButton btnBuyWarrior;
    private static JButton btnBuyWorker;
    private static JButton btnBuyMage;

    public static JProgressBar progressBarGM;
    public static JProgressBar progressBarIM;
    public static JProgressBar progressBarUGM;
    public static JProgressBar progressBarMF;



    public MainWindow() throws Exception {
        initialize();
    }

    private void initialize() throws Exception {

        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

        frame = new JFrame();
        frame.setBounds(200, 200, 630, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);  // At center of the window
        frame.setVisible(true);

        JLabel lblNewLabel = new JLabel("Warr:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel.setBounds(285, 11, 45, 19);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblWarr = new JLabel("Gold:");
        lblWarr.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblWarr.setBounds(285, 41, 45, 19);
        frame.getContentPane().add(lblWarr);

        JLabel lblMage = new JLabel("Mage:");
        lblMage.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblMage.setBounds(285, 71, 45, 19);
        frame.getContentPane().add(lblMage);

        JLabel lblIron = new JLabel("Iron:");
        lblIron.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblIron.setBounds(285, 101, 45, 19);
        frame.getContentPane().add(lblIron);

        JLabel lblWorker = new JLabel("Work:");
        lblWorker.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblWorker.setBounds(285, 131, 45, 19);
        frame.getContentPane().add(lblWorker);

        btnAddGm = new JButton("Add GM");
        btnAddGm.addActionListener(e -> AllBuildActions.buildGoldMine());

        btnAddGm.setBounds(22, 10, 120, 23);
        frame.getContentPane().add(btnAddGm);

        JButton btnAddMF = new JButton("Add MF");
        btnAddMF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AllBuildActions.buildMilkFarm();
            }
        });
        btnAddMF.setBounds(420, 10, 120, 23);
        frame.getContentPane().add(btnAddMF);

        JButton btnRemoveMF = new JButton("Remove MF");
        btnRemoveMF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MilkFarm.deleteMilkFarm();
            }
        });
        btnRemoveMF.setBounds(420, 130, 120, 23);
        frame.getContentPane().add(btnRemoveMF);

        JButton killMage = new JButton("Kill Mage");
        killMage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // AllBuildActions.buildMilkFarm();
            }
        });
        killMage.setBounds(420, 160, 120, 23);
        frame.getContentPane().add(killMage);


        JButton btnAddIm = new JButton("Add IM");
        btnAddIm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AllBuildActions.buildIronMine();
            }
        });
        btnAddIm.setBounds(22, 49, 120, 23);
        frame.getContentPane().add(btnAddIm);

        btnBuyMage = new JButton("Buy Mage");
        btnBuyMage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UnitAdd.addMageUnit();
            }
        });
        btnBuyMage.setBounds(22, 117, 120, 23);
        frame.getContentPane().add(btnBuyMage);

        btnBuyWarrior = new JButton("Buy Warrior");
        btnBuyWarrior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                UnitAdd.addWarriorUnit();
            }
        });
        btnBuyWarrior.setBounds(22, 151, 120, 23);
        frame.getContentPane().add(btnBuyWarrior);

        btnBuyWorker = new JButton("Buy Worker");
        btnBuyWorker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                UnitAdd.addWorkerUnit();
            }
        });
        btnBuyWorker.setBounds(22, 185, 120, 23);
        frame.getContentPane().add(btnBuyWorker);


        JButton upgradeMine = new JButton("GM upgrade");
        upgradeMine.setBounds(22, 83, 120, 23);
        upgradeMine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GoldMine.updateGoldMine();
            }
        });
        frame.getContentPane().add(upgradeMine);

        food = new JLabel("Food:");
        food.setFont(new Font("Tahoma", Font.PLAIN, 13));
        food.setForeground(Color.BLUE);
        food.setBounds(34, 212, 78, 19);
        frame.getContentPane().add(food);


        JLabel upgradedGM = new JLabel("Upgr. GM:");
        upgradedGM.setFont(new Font("Tahoma", Font.PLAIN, 13));
        upgradedGM.setBounds(125, 212, 78, 19);
        frame.getContentPane().add(upgradedGM);

        JLabel lblGoldmines = new JLabel("GoldMines:");
        lblGoldmines.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblGoldmines.setBounds(224, 212, 78, 19);
        frame.getContentPane().add(lblGoldmines);

        JLabel lblIronmines = new JLabel("IronMines:");
        lblIronmines.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblIronmines.setBounds(329, 212, 78, 19);
        frame.getContentPane().add(lblIronmines);

        JLabel lblMilkFarms = new JLabel("MilkFarms:");
        lblMilkFarms.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblMilkFarms.setBounds(434, 212, 78, 19);
        frame.getContentPane().add(lblMilkFarms);

        JLabel lblEnemyTimer = new JLabel("Enemy:");
        lblEnemyTimer.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblEnemyTimer.setBounds(539, 212, 78, 19);
        lblEnemyTimer.setForeground(Color.RED);
        frame.getContentPane().add(lblEnemyTimer);


        progressBarGM = new JProgressBar();
        progressBarGM.setBounds(151, 11, 112, 19);
        progressBarGM.setMaximum(100);
        frame.getContentPane().add(progressBarGM);

        progressBarIM = new JProgressBar();
        progressBarIM.setBounds(151, 50, 112, 19);
        progressBarIM.setMaximum(100);
        frame.getContentPane().add(progressBarIM);

        progressBarUGM = new JProgressBar();
        progressBarUGM.setBounds(151, 85, 112, 19);
        progressBarUGM.setMaximum(100);
        frame.getContentPane().add(progressBarUGM);

        progressBarMF = new JProgressBar();
        progressBarMF.setBounds(420, 40, 120, 19);
        progressBarMF.setMaximum(100);
        frame.getContentPane().add(progressBarMF);

        textFieldWarrior = new JTextField();
        textFieldWarrior.setColumns(10);
        textFieldWarrior.setBounds(352, 11, 50, 20);
        frame.getContentPane().add(textFieldWarrior);
        // textFieldGold.setText(Integer.toString(Warrior.warriorCount));


        textFieldGold = new JTextField();
        textFieldGold.setColumns(10);
        textFieldGold.setBounds(352, 41, 50, 20);
        //textFieldWarrior.setText(Integer.toString(Warrior.warriorCount));
        frame.getContentPane().add(textFieldGold);

        textFieldMage = new JTextField();
        textFieldMage.setColumns(10);
        textFieldMage.setBounds(352, 71, 50, 20);
        frame.getContentPane().add(textFieldMage);

        textFieldIron = new JTextField();
        textFieldIron.setColumns(10);
        textFieldIron.setBounds(352, 101, 50, 20);
        frame.getContentPane().add(textFieldIron);

        textFieldWorker = new JTextField();
        textFieldWorker.setColumns(10);
        textFieldWorker.setBounds(352, 131, 50, 20);
        frame.getContentPane().add(textFieldWorker);

        systemMessage = new JLabel("");
        systemMessage.setHorizontalAlignment(SwingConstants.CENTER);
        systemMessage.setForeground(Color.BLUE);
        systemMessage.setBounds(170, 165, 200, 30);
        frame.getContentPane().add(systemMessage);

        foodCount = new JTextField();
        foodCount.setColumns(10);
        foodCount.setBounds(24, 231, 50, 20);
        frame.getContentPane().add(foodCount);

        upgradetGoldMines = new JTextField();
        upgradetGoldMines.setColumns(10);
        upgradetGoldMines.setBounds(129, 231, 50, 20);
        frame.getContentPane().add(upgradetGoldMines);

        goldMines = new JTextField();
        goldMines.setColumns(10);
        goldMines.setBounds(234, 231, 50, 20);
        frame.getContentPane().add(goldMines);

        ironMines = new JTextField();
        ironMines.setColumns(10);
        ironMines.setBounds(339, 231, 50, 20);
        frame.getContentPane().add(ironMines);

        milkFarms = new JTextField();
        milkFarms.setColumns(10);
        milkFarms.setBounds(445, 231, 50, 20);
        frame.getContentPane().add(milkFarms);

        enemyTimeTextField = new JTextField();
        enemyTimeTextField.setColumns(10);
        enemyTimeTextField.setBounds(539, 231, 50, 20);
        frame.getContentPane().add(enemyTimeTextField);

        JLabel costMage = new JLabel("10 G");
        costMage.setFont(new Font("Tahoma", Font.PLAIN, 13));
        costMage.setBounds(152, 118, 78, 19);
        frame.getContentPane().add(costMage);

        JLabel costWarrior = new JLabel("10 G+I");
        costWarrior.setFont(new Font("Tahoma", Font.PLAIN, 13));
        costWarrior.setBounds(152, 155, 78, 19);
        frame.getContentPane().add(costWarrior);

        JLabel costWorker = new JLabel("10 G");
        costWorker.setFont(new Font("Tahoma", Font.PLAIN, 13));
        costWorker.setBounds(152, 187, 78, 19);
        frame.getContentPane().add(costWorker);

        SwingUtilities.updateComponentTreeUI(frame);

    }

    public static void setWarrToGui() {
        textFieldWarrior.setText(Integer.toString(Warrior.warriorCount));
    }

    public static void setWorkerToGui() {
        textFieldWorker.setText(Integer.toString(Worker.workerCount));
    }

    public static void setGoldToGui() {
        textFieldGold.setText(Integer.toString(Gold.getGoldAmount()));
    }

    public static void setIronToGui() {
        textFieldIron.setText(Integer.toString(Iron.getIronAmount()));
    }

    public static void setMageToGui() {
        textFieldMage.setText(Integer.toString(Mage.mageCount));
    }

    public static void setGMTGui() {
        goldMines.setText(Integer.toString(GoldMine.getGoldMines()));
    }

    public static void setMFGui() {
        milkFarms.setText(Integer.toString(MilkFarm.getMilkFarms()));
    }

    public static void setEnemyTimerToGui() {
        enemyTimeTextField.setText(Integer.toString(EnemyTimer.getSecondsBeforeEnemyStartsInvasion()));
    }

    public static void setUpgradedGMT0Gui() {
        upgradetGoldMines.setText(Integer.toString(GoldMine.getUpdatedGoldMines()));
    }

    public static void setFoodToGui() {
        foodCount.setText(Integer.toString(Food.getFoodAccount()));
    }

    public static void setIMToGui() {
        ironMines.setText(Integer.toString(IronMine.getIronMines()));
    }

    public static void setTextToLabel(String text) {
        systemMessage.setText(text);
    }

    public static void setErrorTextToLabel(String text) {
        systemMessage.setForeground(Color.RED);
        systemMessage.setText(text);
        foodCount.setForeground(Color.RED);
        food.setForeground(Color.RED);
    }

    private static void buttonWarriorCheck() {
        if (Gold.getGoldAmount() < 10) {
            btnBuyWarrior.setEnabled(false);
        } else if (Iron.getIronAmount() < 10) {
            btnBuyWarrior.setEnabled(false);
        } else {
            btnBuyWarrior.setEnabled(true);
        }

    }

    private static void buttonMageCheck() {
        if (Gold.getGoldAmount() < 10) {
            btnBuyMage.setEnabled(false);
        } else {
            btnBuyMage.setEnabled(true);
        }
    }

    private static void buttonWorkerCheck() {
        if (Gold.getGoldAmount() < 10) {
            btnBuyWorker.setEnabled(false);
        } else {
            btnBuyWorker.setEnabled(true);
        }
    }

    public static void allButtonsCheck() {
        buttonWarriorCheck();
        buttonMageCheck();
        buttonWorkerCheck();
    }

    //private ImageIcon endGame = new ImageIcon(getClass().getResource("D:\\Pragramming\\Java\\Intelij Projects\\Economic_Strategy\\resources\\EndGame.png")); // for non-static
   // private static ImageIcon endGame = new ImageIcon(MainWindow.class.getResource("EndGame.png"));

    public static void endNotification() {
     // JOptionPane.showMessageDialog(null, "You have failed the city!", "End Game", JOptionPane.INFORMATION_MESSAGE, endGame);
      JOptionPane.showMessageDialog(null, "You have failed the city!", "End Game", JOptionPane.INFORMATION_MESSAGE);
    }

}

