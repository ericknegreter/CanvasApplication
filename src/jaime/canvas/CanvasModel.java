package jaime.canvas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author jaime
 */
public class CanvasModel extends javax.swing.JFrame {

    DefaultListModel listModelPartners = new DefaultListModel();
    DefaultListModel listModelActivities = new DefaultListModel();
    DefaultListModel listModelResources = new DefaultListModel();
    DefaultListModel listModelPurpose = new DefaultListModel();
    DefaultListModel listModelRelations = new DefaultListModel();
    DefaultListModel listModelChannels = new DefaultListModel();
    DefaultListModel listModelClients = new DefaultListModel();
    DefaultListModel listModelStreams = new DefaultListModel();
    DefaultListModel listModelCosts = new DefaultListModel();
    
    DefaultListModel listModelPartnersDesc = new DefaultListModel();
    DefaultListModel listModelActivitiesDesc = new DefaultListModel();
    DefaultListModel listModelResourcesDesc = new DefaultListModel();
    DefaultListModel listModelPurposeDesc = new DefaultListModel();
    DefaultListModel listModelRelationsDesc = new DefaultListModel();
    DefaultListModel listModelChannelsDesc = new DefaultListModel();
    DefaultListModel listModelClientsDesc = new DefaultListModel();
    DefaultListModel listModelStreamsDesc = new DefaultListModel();
    DefaultListModel listModelCostsDesc = new DefaultListModel();
    
    
    AddData dialog = new AddData();
    String header = "";
    String description = "";
    int sectionId = 0;
    int jlistIndex = -1;
    
    public void addListHeader(String header, DefaultListModel listModel) {
        listModel.addElement(header);
    }
    
    public void addListDescription(String description, DefaultListModel listModelDesc) {
        listModelDesc.addElement(description);
    }
    
    public void deleteListElements(javax.swing.JList<String> jlist, DefaultListModel listModel) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            ((DefaultListModel) jlist.getModel()).removeElementAt(jlistIndex); 
        }
        else {
        }
    }
    
    public void openDialog(AddData dialog) {
        dialog.setVisible(true);
    }
    
    public String getDialogDescription(AddData dialog) {
        return dialog.getDescription();
        
    }
    
    public String getDialogHeader(AddData dialog) {
        return dialog.getHeader();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(javax.swing.JList<String> jlist, DefaultListModel listModel) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.header = ((DefaultListModel) jlist.getModel()).getElementAt(jlistIndex).toString();
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptionPartners(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelPartnersDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionActivities(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelActivitiesDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionResources(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelResourcesDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionPurpose(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelPurposeDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionChannels(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelChannelsDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionClients(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelClientsDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionStreams(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelStreamsDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionCosts(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelCostsDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    public void setDescriptionRelations(javax.swing.JList<String> jlist) {
        jlistIndex = jlist.getSelectedIndex();
        
        if (jlistIndex >= 0) {
            this.description = listModelRelationsDesc.getElementAt(jlistIndex).toString();
        }
    }
    
    
    public void showDetails(String header, String description) {
        Details details = new Details(header, description);
        details.setVisible(true);
    }
    
    

    /**
     * Creates new form canvasModel
     */
    public CanvasModel() {
        initComponents();
        jListPartners.setModel(listModelPartners);
        jListActivities.setModel(listModelActivities);
        jListResources.setModel(listModelResources);
        jListPurpose.setModel(listModelPurpose);
        jListRelation.setModel(listModelRelations);
        jListChannels.setModel(listModelChannels);
        jListClients.setModel(listModelClients);
        jListStreams.setModel(listModelStreams);
        jListCosts.setModel(listModelCosts);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        panelClients = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnClients = new javax.swing.JButton();
        deleteClient = new javax.swing.JButton();
        addClient = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListClients = new javax.swing.JList<>();
        panelStreams = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnStreams = new javax.swing.JButton();
        addStream = new javax.swing.JButton();
        deleteStream = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListStreams = new javax.swing.JList<>();
        panelResources = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnResources = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListResources = new javax.swing.JList<>();
        deleteResources = new javax.swing.JButton();
        addResources = new javax.swing.JButton();
        panelActivities = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnActivities = new javax.swing.JButton();
        deleteActivity = new javax.swing.JButton();
        addActivity = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListActivities = new javax.swing.JList<>();
        panelRelations = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRelations = new javax.swing.JButton();
        deleteRelation = new javax.swing.JButton();
        addRelation = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListRelation = new javax.swing.JList<>();
        panelChannels = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnChannels = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListChannels = new javax.swing.JList<>();
        deleteChannel = new javax.swing.JButton();
        addChannel = new javax.swing.JButton();
        panelProposal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnProposal = new javax.swing.JButton();
        deleteProposal = new javax.swing.JButton();
        addProposal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPurpose = new javax.swing.JList<>();
        panelPartners = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnPartners = new javax.swing.JButton();
        addPartner = new javax.swing.JButton();
        deletePartner = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPartners = new javax.swing.JList<>();
        panelCosts = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnCosts = new javax.swing.JButton();
        deleteCost = new javax.swing.JButton();
        addCost = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListCosts = new javax.swing.JList<>();

        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi CANVAS");
        setMinimumSize(new java.awt.Dimension(1002, 512));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        panelClients.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segmentos de clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelClients.setMinimumSize(new java.awt.Dimension(180, 20));
        panelClients.setPreferredSize(new java.awt.Dimension(180, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/clientes.png"))); // NOI18N

        btnClients.setText("Detalles");
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });

        deleteClient.setText("-");
        deleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientActionPerformed(evt);
            }
        });

        addClient.setText("+");
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });

        jListClients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListClients);

        javax.swing.GroupLayout panelClientsLayout = new javax.swing.GroupLayout(panelClients);
        panelClients.setLayout(panelClientsLayout);
        panelClientsLayout.setHorizontalGroup(
            panelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientsLayout.createSequentialGroup()
                        .addGroup(panelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelClientsLayout.createSequentialGroup()
                                .addComponent(addClient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnClients))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(panelClientsLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelClientsLayout.setVerticalGroup(
            panelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientsLayout.createSequentialGroup()
                .addGroup(panelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClientsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addClient)
                            .addComponent(deleteClient))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClients)
                .addContainerGap())
        );

        panelStreams.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flujos de ingresos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelStreams.setMinimumSize(new java.awt.Dimension(473, 116));
        panelStreams.setPreferredSize(new java.awt.Dimension(473, 116));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/fuentes_ingresos.png"))); // NOI18N

        btnStreams.setText("Detalles");
        btnStreams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStreamsActionPerformed(evt);
            }
        });

        addStream.setText("+");
        addStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStreamActionPerformed(evt);
            }
        });

        deleteStream.setText("-");
        deleteStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStreamActionPerformed(evt);
            }
        });

        jListStreams.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jListStreams);

        javax.swing.GroupLayout panelStreamsLayout = new javax.swing.GroupLayout(panelStreams);
        panelStreams.setLayout(panelStreamsLayout);
        panelStreamsLayout.setHorizontalGroup(
            panelStreamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStreamsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStreams)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane7)
                .addGap(18, 18, 18)
                .addGroup(panelStreamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStream, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteStream, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        panelStreamsLayout.setVerticalGroup(
            panelStreamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStreamsLayout.createSequentialGroup()
                .addGroup(panelStreamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelStreamsLayout.createSequentialGroup()
                        .addComponent(addStream)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteStream)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStreamsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStreams)
                .addContainerGap())
            .addGroup(panelStreamsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelResources.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recursos clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelResources.setMinimumSize(new java.awt.Dimension(180, 180));
        panelResources.setPreferredSize(new java.awt.Dimension(180, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/recursos_clave.png"))); // NOI18N

        btnResources.setText("Detalles");
        btnResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesActionPerformed(evt);
            }
        });

        jListResources.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jListResources);

        deleteResources.setText("-");
        deleteResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResourcesActionPerformed(evt);
            }
        });

        addResources.setText("+");
        addResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResourcesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResourcesLayout = new javax.swing.GroupLayout(panelResources);
        panelResources.setLayout(panelResourcesLayout);
        panelResourcesLayout.setHorizontalGroup(
            panelResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResourcesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResourcesLayout.createSequentialGroup()
                        .addComponent(btnResources)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(addResources, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteResources, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(panelResourcesLayout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))))
        );
        panelResourcesLayout.setVerticalGroup(
            panelResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResourcesLayout.createSequentialGroup()
                .addGroup(panelResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResourcesLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panelResourcesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResources)
                    .addComponent(addResources)
                    .addComponent(deleteResources))
                .addContainerGap())
        );

        panelActivities.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actividades clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelActivities.setMinimumSize(new java.awt.Dimension(180, 180));
        panelActivities.setPreferredSize(new java.awt.Dimension(180, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/actividades_clave.png"))); // NOI18N

        btnActivities.setText("Detalles");
        btnActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivitiesActionPerformed(evt);
            }
        });

        deleteActivity.setText("-");
        deleteActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActivityActionPerformed(evt);
            }
        });

        addActivity.setText("+");
        addActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActivityActionPerformed(evt);
            }
        });

        jListActivities.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(jListActivities);

        javax.swing.GroupLayout panelActivitiesLayout = new javax.swing.GroupLayout(panelActivities);
        panelActivities.setLayout(panelActivitiesLayout);
        panelActivitiesLayout.setHorizontalGroup(
            panelActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActivitiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(panelActivitiesLayout.createSequentialGroup()
                        .addComponent(btnActivities)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelActivitiesLayout.createSequentialGroup()
                        .addComponent(addActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        panelActivitiesLayout.setVerticalGroup(
            panelActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActivitiesLayout.createSequentialGroup()
                .addGroup(panelActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelActivitiesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelActivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addActivity)
                            .addComponent(deleteActivity))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActivities)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRelations.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relación con el cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelRelations.setMinimumSize(new java.awt.Dimension(180, 180));
        panelRelations.setPreferredSize(new java.awt.Dimension(180, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/rel_cliente.png"))); // NOI18N

        btnRelations.setText("Detalles");
        btnRelations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelationsActionPerformed(evt);
            }
        });

        deleteRelation.setText("-");
        deleteRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRelationActionPerformed(evt);
            }
        });

        addRelation.setText("+");
        addRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationActionPerformed(evt);
            }
        });

        jListRelation.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jListRelation);

        javax.swing.GroupLayout panelRelationsLayout = new javax.swing.GroupLayout(panelRelations);
        panelRelations.setLayout(panelRelationsLayout);
        panelRelationsLayout.setHorizontalGroup(
            panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRelationsLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(addRelation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteRelation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRelationsLayout.createSequentialGroup()
                        .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRelations)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRelationsLayout.setVerticalGroup(
            panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelationsLayout.createSequentialGroup()
                .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRelationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addRelation)
                            .addComponent(deleteRelation))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelations)
                .addContainerGap())
        );

        panelChannels.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelChannels.setMinimumSize(new java.awt.Dimension(180, 180));
        panelChannels.setPreferredSize(new java.awt.Dimension(180, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/canal_distrib.png"))); // NOI18N

        btnChannels.setText("Detalles");
        btnChannels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChannelsActionPerformed(evt);
            }
        });

        jListChannels.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListChannels);

        deleteChannel.setText("-");
        deleteChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteChannelActionPerformed(evt);
            }
        });

        addChannel.setText("+");
        addChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChannelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChannelsLayout = new javax.swing.GroupLayout(panelChannels);
        panelChannels.setLayout(panelChannelsLayout);
        panelChannelsLayout.setHorizontalGroup(
            panelChannelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChannelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChannelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(panelChannelsLayout.createSequentialGroup()
                        .addComponent(btnChannels)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelChannelsLayout.createSequentialGroup()
                        .addComponent(addChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteChannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        panelChannelsLayout.setVerticalGroup(
            panelChannelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChannelsLayout.createSequentialGroup()
                .addGroup(panelChannelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelChannelsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelChannelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addChannel)
                            .addComponent(deleteChannel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChannels)
                .addContainerGap())
        );

        panelProposal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propuestas de valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelProposal.setMinimumSize(new java.awt.Dimension(180, 20));
        panelProposal.setPreferredSize(new java.awt.Dimension(180, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/propuesta_valor.png"))); // NOI18N

        btnProposal.setText("Detalles");
        btnProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProposalActionPerformed(evt);
            }
        });

        deleteProposal.setText("-");
        deleteProposal.setMaximumSize(new java.awt.Dimension(22, 31));
        deleteProposal.setMinimumSize(new java.awt.Dimension(22, 31));
        deleteProposal.setPreferredSize(new java.awt.Dimension(22, 31));
        deleteProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProposalActionPerformed(evt);
            }
        });

        addProposal.setText("+");
        addProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProposalActionPerformed(evt);
            }
        });

        jListPurpose.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListPurpose);

        javax.swing.GroupLayout panelProposalLayout = new javax.swing.GroupLayout(panelProposal);
        panelProposal.setLayout(panelProposalLayout);
        panelProposalLayout.setHorizontalGroup(
            panelProposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProposalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProposalLayout.createSequentialGroup()
                        .addComponent(addProposal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteProposal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProposalLayout.createSequentialGroup()
                        .addGroup(panelProposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProposal)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelProposalLayout.setVerticalGroup(
            panelProposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProposalLayout.createSequentialGroup()
                .addGroup(panelProposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProposalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelProposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addProposal)
                            .addComponent(deleteProposal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProposal)
                .addContainerGap())
        );

        panelPartners.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Key Partners", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelPartners.setMinimumSize(new java.awt.Dimension(190, 20));
        panelPartners.setName("keyParterns"); // NOI18N
        panelPartners.setPreferredSize(new java.awt.Dimension(190, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/socios_clave.png"))); // NOI18N

        btnPartners.setText("Detalles");
        btnPartners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartnersActionPerformed(evt);
            }
        });

        addPartner.setText("+");
        addPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartnerActionPerformed(evt);
            }
        });

        deletePartner.setText("-");
        deletePartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePartnerActionPerformed(evt);
            }
        });

        jListPartners.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListPartners);

        javax.swing.GroupLayout panelPartnersLayout = new javax.swing.GroupLayout(panelPartners);
        panelPartners.setLayout(panelPartnersLayout);
        panelPartnersLayout.setHorizontalGroup(
            panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPartnersLayout.createSequentialGroup()
                .addGroup(panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPartnersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPartners)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPartnersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPartnersLayout.createSequentialGroup()
                                .addComponent(addPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletePartner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))))
                .addContainerGap())
        );
        panelPartnersLayout.setVerticalGroup(
            panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPartnersLayout.createSequentialGroup()
                .addGroup(panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPartnersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPartner)
                            .addComponent(deletePartner)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPartners)
                .addContainerGap())
        );

        panelCosts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estructura de costos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelCosts.setMinimumSize(new java.awt.Dimension(473, 116));
        panelCosts.setPreferredSize(new java.awt.Dimension(473, 116));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaime/canvas/images/estructura_costos.png"))); // NOI18N

        btnCosts.setText("Detalles");
        btnCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostsActionPerformed(evt);
            }
        });

        deleteCost.setText("-");
        deleteCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCostActionPerformed(evt);
            }
        });

        addCost.setText("+");
        addCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCostActionPerformed(evt);
            }
        });

        jListCosts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jListCosts);

        javax.swing.GroupLayout panelCostsLayout = new javax.swing.GroupLayout(panelCosts);
        panelCosts.setLayout(panelCostsLayout);
        panelCostsLayout.setHorizontalGroup(
            panelCostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCosts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addCost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        panelCostsLayout.setVerticalGroup(
            panelCostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostsLayout.createSequentialGroup()
                .addGroup(panelCostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCosts))
                    .addComponent(jLabel8)
                    .addGroup(panelCostsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCostsLayout.createSequentialGroup()
                                .addComponent(addCost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteCost)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPartners, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelActivities, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(panelResources, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelProposal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelChannels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRelations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelClients, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelCosts, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelStreams, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRelations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelChannels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelProposal, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(panelPartners, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelActivities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelResources, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelClients, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCosts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStreams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChannelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChannelsActionPerformed
        // TODO add your handling code here:
        setHeader(jListChannels, listModelChannels);
        setDescriptionChannels(jListChannels);
        showDetails(header, description);
    }//GEN-LAST:event_btnChannelsActionPerformed

    private void addCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCostActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 8;
    }//GEN-LAST:event_addCostActionPerformed

    private void addStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStreamActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 7;
    }//GEN-LAST:event_addStreamActionPerformed

    private void addPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartnerActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 0;
    }//GEN-LAST:event_addPartnerActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        
        if(dialog.getfocusStatus())
            switch(sectionId) {
                case 0:
                    addListHeader(getDialogHeader(dialog), listModelPartners);
                    addListDescription(getDialogDescription(dialog), listModelPartnersDesc);
                    break;
                case 1:
                    addListHeader(getDialogHeader(dialog), listModelActivities);
                    addListDescription(getDialogDescription(dialog), listModelActivitiesDesc);
                    break;
                case 2:
                    addListHeader(getDialogHeader(dialog), listModelResources);
                    addListDescription(getDialogDescription(dialog), listModelResourcesDesc);
                    break;
                case 3:
                    addListHeader(getDialogHeader(dialog), listModelPurpose);
                    addListDescription(getDialogDescription(dialog), listModelPurposeDesc);
                    break;
                case 4:
                    addListHeader(getDialogHeader(dialog), listModelRelations);
                    addListDescription(getDialogDescription(dialog), listModelRelationsDesc);
                    break;
                case 5:
                    addListHeader(getDialogHeader(dialog), listModelChannels);
                    addListDescription(getDialogDescription(dialog), listModelChannelsDesc);
                    break;
                case 6:
                    addListHeader(getDialogHeader(dialog), listModelClients);
                    addListDescription(getDialogDescription(dialog), listModelClientsDesc);
                    break;
                case 7:
                    addListHeader(getDialogHeader(dialog), listModelStreams);
                    addListDescription(getDialogDescription(dialog), listModelStreamsDesc);
                    break;
                case 8:
                    addListHeader(getDialogHeader(dialog), listModelCosts);
                    addListDescription(getDialogDescription(dialog), listModelCostsDesc);
                    break;
                    
            }    
        dialog.setfocusStatus(false);
    }//GEN-LAST:event_formWindowGainedFocus

    private void addActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActivityActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 1;
    }//GEN-LAST:event_addActivityActionPerformed

    private void addProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProposalActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 3;
    }//GEN-LAST:event_addProposalActionPerformed

    private void addResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResourcesActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 2;
    }//GEN-LAST:event_addResourcesActionPerformed

    private void addRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 4;
    }//GEN-LAST:event_addRelationActionPerformed

    private void addChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChannelActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 5;
    }//GEN-LAST:event_addChannelActionPerformed

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        // TODO add your handling code here:
        openDialog(dialog);
        sectionId = 6;
    }//GEN-LAST:event_addClientActionPerformed

    private void deletePartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePartnerActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListPartners, listModelPartners);
    }//GEN-LAST:event_deletePartnerActionPerformed

    private void deleteActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActivityActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListActivities, listModelActivities);
    }//GEN-LAST:event_deleteActivityActionPerformed

    private void deleteProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProposalActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListPurpose, listModelPurpose);
    }//GEN-LAST:event_deleteProposalActionPerformed

    private void deleteResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResourcesActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListResources, listModelResources);
    }//GEN-LAST:event_deleteResourcesActionPerformed

    private void deleteRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRelationActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListRelation, listModelRelations);
    }//GEN-LAST:event_deleteRelationActionPerformed

    private void deleteChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteChannelActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListChannels, listModelChannels);
    }//GEN-LAST:event_deleteChannelActionPerformed

    private void deleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListClients, listModelClients);
    }//GEN-LAST:event_deleteClientActionPerformed

    private void deleteStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStreamActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListStreams, listModelStreams);
    }//GEN-LAST:event_deleteStreamActionPerformed

    private void deleteCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCostActionPerformed
        // TODO add your handling code here:
        deleteListElements(jListCosts, listModelCosts);
    }//GEN-LAST:event_deleteCostActionPerformed

    private void btnPartnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartnersActionPerformed
        // TODO add your handling code here:
        setHeader(jListPartners, listModelPartners);
        setDescriptionPartners(jListPartners);
        showDetails(header, description);
    }//GEN-LAST:event_btnPartnersActionPerformed

    private void btnActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivitiesActionPerformed
        // TODO add your handling code here:
        setHeader(jListActivities, listModelActivities);
        setDescriptionActivities(jListActivities);
        showDetails(header, description);
    }//GEN-LAST:event_btnActivitiesActionPerformed

    private void btnResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResourcesActionPerformed
        // TODO add your handling code here:
        setHeader(jListResources, listModelResources);
        setDescriptionResources(jListResources);
        showDetails(header, description);
    }//GEN-LAST:event_btnResourcesActionPerformed

    private void btnProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProposalActionPerformed
        // TODO add your handling code here:
        setHeader(jListPurpose, listModelPurpose);
        setDescriptionPurpose(jListPurpose);
        showDetails(header, description);
    }//GEN-LAST:event_btnProposalActionPerformed

    private void btnRelationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelationsActionPerformed
        // TODO add your handling code here:
        setHeader(jListRelation, listModelRelations);
        setDescriptionRelations(jListRelation);
        showDetails(header, description);
    }//GEN-LAST:event_btnRelationsActionPerformed

    private void btnClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientsActionPerformed
        // TODO add your handling code here:
        setHeader(jListClients, listModelClients);
        setDescriptionClients(jListClients);
        showDetails(header, description);
    }//GEN-LAST:event_btnClientsActionPerformed

    private void btnStreamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreamsActionPerformed
        // TODO add your handling code here:
        setHeader(jListStreams, listModelStreams);
        setDescriptionStreams(jListStreams);
        showDetails(header, description);
    }//GEN-LAST:event_btnStreamsActionPerformed

    private void btnCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostsActionPerformed
        // TODO add your handling code here:
        setHeader(jListCosts, listModelCosts);
        setDescriptionCosts(jListCosts);
        showDetails(header, description);
    }//GEN-LAST:event_btnCostsActionPerformed

    
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
            java.util.logging.Logger.getLogger(CanvasModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CanvasModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CanvasModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CanvasModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //Jbutton button = new JButton();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new CanvasModel().setVisible(true);
            }
        });
        
      /*  addPartner.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });*/
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addActivity;
    private javax.swing.JButton addChannel;
    private javax.swing.JButton addClient;
    private javax.swing.JButton addCost;
    private javax.swing.JButton addPartner;
    private javax.swing.JButton addProposal;
    private javax.swing.JButton addRelation;
    private javax.swing.JButton addResources;
    private javax.swing.JButton addStream;
    private javax.swing.JButton btnActivities;
    private javax.swing.JButton btnChannels;
    private javax.swing.JButton btnClients;
    private javax.swing.JButton btnCosts;
    private javax.swing.JButton btnPartners;
    private javax.swing.JButton btnProposal;
    private javax.swing.JButton btnRelations;
    private javax.swing.JButton btnResources;
    private javax.swing.JButton btnStreams;
    private javax.swing.JButton deleteActivity;
    private javax.swing.JButton deleteChannel;
    private javax.swing.JButton deleteClient;
    private javax.swing.JButton deleteCost;
    private javax.swing.JButton deletePartner;
    private javax.swing.JButton deleteProposal;
    private javax.swing.JButton deleteRelation;
    private javax.swing.JButton deleteResources;
    private javax.swing.JButton deleteStream;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jListActivities;
    private javax.swing.JList<String> jListChannels;
    private javax.swing.JList<String> jListClients;
    private javax.swing.JList<String> jListCosts;
    private javax.swing.JList<String> jListPartners;
    private javax.swing.JList<String> jListPurpose;
    private javax.swing.JList<String> jListRelation;
    private javax.swing.JList<String> jListResources;
    private javax.swing.JList<String> jListStreams;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel panelActivities;
    private javax.swing.JPanel panelChannels;
    private javax.swing.JPanel panelClients;
    private javax.swing.JPanel panelCosts;
    private javax.swing.JPanel panelPartners;
    private javax.swing.JPanel panelProposal;
    private javax.swing.JPanel panelRelations;
    private javax.swing.JPanel panelResources;
    private javax.swing.JPanel panelStreams;
    // End of variables declaration//GEN-END:variables
}
