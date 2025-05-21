 registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String regNo = regNoField.getText();
                String parentEmail = parentField.getText();

                if (name.isEmpty() || regNo.isEmpty() || parentEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Simulate registration (replace with actual logic)
                    JOptionPane.showMessageDialog(frame, 
                        "Registration Successful!\n" +
                        "Name: " + name + "\n" +
                        "Reg No: " + regNo + "\n" +
                        "Parent: " + parentEmail, 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
